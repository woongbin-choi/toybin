package com.toybin.api.request;

import com.toybin.api.exception.InvalidRequest;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotBlank;

@ToString
@Getter
@Setter
public class PostCreate {

    @NotBlank(message = "제목을 입력해주세요")
    private String title;

    @NotBlank(message = "내용을 입력해주세요")
    private String content;

    @Builder
    public PostCreate(String title, String content){
        this.title = title;
        this.content = content;
    }

    public void validationChk() {
        if(title.contains("바보")){
            throw new InvalidRequest("title","제목에 바보를 포함할 수 없습니다");
        }
    }
}
