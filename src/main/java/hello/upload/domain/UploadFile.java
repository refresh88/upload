package hello.upload.domain;

import lombok.Data;

@Data
public class UploadFile {

    private String uploadFileName;

    // 같은 이름의 파일이 들어왔을때 uuid로 구분하기 위함.
    private String storeFileName;

    public UploadFile(String uploadFileName, String storeFileName) {
        this.uploadFileName = uploadFileName;
        this.storeFileName = storeFileName;
    }
}
