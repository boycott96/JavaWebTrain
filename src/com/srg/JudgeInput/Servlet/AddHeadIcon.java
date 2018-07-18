package com.srg.JudgeInput.Servlet;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import com.srg.user.entity.Users;

/**
 * Servlet implementation class AddHeadIcon
 */
@WebServlet("/addHeadIcon")
public class AddHeadIcon extends HttpServlet {
	private static final long serialVersionUID = 1L;
	// 上传文件存储目录
	private static final String UPLOAD_DIRECTORY = "D:/WorkSpace/JavaWebTrain/WebContent/files/userPhotos";

	// 上传配置
	private static final int MEMORY_THRESHOLD = 1024 * 1024 * 3; // 3MB
	private static final int MAX_FILE_SIZE = 1024 * 1024 * 40; // 40MB
	private static final int MAX_REQUEST_SIZE = 1024 * 1024 * 50; // 50MB

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AddHeadIcon() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session = request.getSession();
		Users user = (Users) session.getAttribute("user");
		if (!ServletFileUpload.isMultipartContent(request)) {
			PrintWriter writer = response.getWriter();
			writer.println("Error: 表单必须包含 enctype=multipart/form-data");
			writer.flush();
			return;
		}

		DiskFileItemFactory factory = new DiskFileItemFactory();
		factory.setSizeThreshold(MEMORY_THRESHOLD);
		factory.setRepository(new File(System.getProperty("java.io.tmpdir")));

		ServletFileUpload upload = new ServletFileUpload(factory);

		upload.setFileSizeMax(MAX_FILE_SIZE);

		upload.setSizeMax(MAX_REQUEST_SIZE);

		upload.setHeaderEncoding("UTF-8");

		String uploadPath = UPLOAD_DIRECTORY;

		File uploadDir = new File(uploadPath);
		if (!uploadDir.exists()) {
			uploadDir.mkdir();
		}

		try {
			@SuppressWarnings("unchecked")
			List<FileItem> formItems = upload.parseRequest(request);

			if (formItems != null && formItems.size() > 0) {
				for (FileItem item : formItems) {
					if (!item.isFormField()) {
						String fileName = user.getName() + ".jpg";
						String filePath = uploadPath + "/" + fileName;
						File storeFile = new File(filePath);
						System.out.println(filePath);
						item.write(storeFile);
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		response.sendRedirect("musicManage");
	}

}
