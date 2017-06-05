/**
 * 
 */
package com.lam.xacn.web.controllers;

/**
 * @author LamNguyen
 *
 */

import java.io.IOException;
import java.io.InputStream;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dropbox.core.DbxDownloader;
import com.dropbox.core.DbxException;
import com.dropbox.core.v2.files.FileMetadata;
import com.dropbox.core.v2.files.ListFolderErrorException;
import com.lam.xacn.web.services.DropboxService;


@Controller
public class ImageController {
	
	@Autowired
	private DropboxService dropboxService;

	@RequestMapping(value = "/imgs/{file}.{ext}", method = RequestMethod.GET)
	public @ResponseBody void generateImage(
	        @PathVariable("file") String file, 
	        @PathVariable("ext") String ext,
	        HttpServletRequest request, 
	        HttpServletResponse response) throws ListFolderErrorException, DbxException, IOException {
		
		String imageFileName = file + "." + ext;
		
		String path = "/App/images/" + imageFileName;
		DbxDownloader<FileMetadata> downloader = dropboxService.getDownloader(path);
		try {
			InputStream is = downloader.getInputStream();
		    org.apache.commons.io.IOUtils.copy(is, response.getOutputStream());
		    response.flushBuffer();
		} finally {
			downloader.close();
		}
		
		response.setContentType("");
	}
	
}
