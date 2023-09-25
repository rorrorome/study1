package com.example.account.type;

import lombok.*;

@Getter
@AllArgsConstructor
public enum ErrorCode {
	USER_NOT_FOUND("사용자가 없습니다.");
	
	private final String description;

}
