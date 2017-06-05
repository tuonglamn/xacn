package com.lam.xacn.web.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dropbox.core.DbxDownloader;
import com.dropbox.core.DbxException;
import com.dropbox.core.DbxRequestConfig;
import com.dropbox.core.v2.DbxClientV2;
import com.dropbox.core.v2.files.DownloadErrorException;
import com.dropbox.core.v2.files.FileMetadata;
import com.dropbox.core.v2.files.ListFolderErrorException;
import com.dropbox.core.v2.files.ListFolderResult;
import com.dropbox.core.v2.files.Metadata;

@Service
public class DropboxService {
	
	@Autowired
	private DbxClientV2 dropboxClient;

	public DbxClientV2 getClient(String token){
		
		DbxRequestConfig config = new DbxRequestConfig("gamesneed/1.0");
		
		DbxClientV2 client = new DbxClientV2(config, token);
		
		return client;
	}	
	
	public DbxDownloader<FileMetadata> getDownloader(String path) throws DownloadErrorException, DbxException{
		DbxDownloader<FileMetadata> result = dropboxClient.files().download(path);
		return result;
	}
	
	public ListFolderResult listFolder(String path) throws ListFolderErrorException, DbxException {
		ListFolderResult result = dropboxClient.files().listFolder(path);
		return result;
	}
		
	public ListFolderResult listFolder(DbxClientV2 client, String path) throws ListFolderErrorException, DbxException{
		ListFolderResult result = client.files().listFolder(path);
        while (true) {
            for (Metadata metadata : result.getEntries()) {
                System.out.println(metadata.getPathLower());
            }

            if (!result.getHasMore()) {
                break;
            }
            result = client.files().listFolderContinue(result.getCursor());
        }
		return result;
	}
	
}
