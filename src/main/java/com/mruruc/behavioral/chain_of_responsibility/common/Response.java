package com.mruruc.behavioral.chain_of_responsibility.common;

public record Response(
        boolean isHandled,
        String payload
) {
}
