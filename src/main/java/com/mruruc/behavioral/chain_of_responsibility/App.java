package com.mruruc.behavioral.chain_of_responsibility;

import com.mruruc.behavioral.chain_of_responsibility.common.Request;
import com.mruruc.behavioral.chain_of_responsibility.common.Response;
import com.mruruc.behavioral.chain_of_responsibility.v1.AuthHandler;
import com.mruruc.behavioral.chain_of_responsibility.v1.BusinessHandler;
import com.mruruc.behavioral.chain_of_responsibility.v1.Handler;
import com.mruruc.behavioral.chain_of_responsibility.v1.LoggingHandler;
import com.mruruc.behavioral.chain_of_responsibility.v3.Filter;
import com.mruruc.behavioral.chain_of_responsibility.v3.FilterChain;
import com.mruruc.behavioral.chain_of_responsibility.v3.FilterManager;

public class App {
    public static void main(String[] args) throws Exception {

        // v1
        Handler logging = new LoggingHandler();

        Handler authentication = new AuthHandler();

        Handler business = new BusinessHandler();


        logging.setNext(authentication);
        authentication.setNext(business);

        Request request = new Request("AUTH|LOG|BUSINESS|Some important data");

        Response handle = logging.handle(request);

        System.out.println("Final Response: " + handle.payload());

        // v2

//        var context = new Context();
//        context.set("token", "auth-token");
//        context.set("payload", "Some important data");
//
//        ContextHandler authHandler = ctx -> {
//            String token = (String) ctx.get("token");
//            if (token == null || token.isEmpty()) {
//                ctx.abort("unauthenticated request");
//            } else ctx.set("user", "alice");
//        };
//
//
//        ContextHandler validation = ctx -> {
//            String payload = ctx.get("payload");
//            if (payload == null || payload.length() < 3) ctx.abort("invalid payload");
//            else ctx.set("validated", true);
//        };
//
//        ContextHandler business = ctx -> {
//            System.out.println("Business running for user=" + ctx.get("user") + " payload=" + ctx.get("payload"));
//            ctx.set("result", "ok");
//        };
//
//
//        var handlerChain = new HandlerChain.Builder()
//                .add(authHandler)
//                .add(validation)
//                .add(business)
//                .build();
//
//        handlerChain.execute(context);
//
//        System.out.println("aborted ? " + context.isAborted() + " reason: " + context.abortReason().orElse("none"));

//        Filter loggingFilter = (request, response, chain) -> {
//            System.out.println("Logging filter processing request: " + request.payload());
//            chain.executeFilterChain(request, response);
//            System.out.println("Logging filter processing response: " + response.payload());
//        };
//
//        Filter authFilter = (request, response, chain) -> {
//            if (request.payload().contains("AUTH")) {
//                System.out.println("Authentication successful");
//                chain.executeFilterChain(request, response);
//            } else {
//                System.out.println("Authentication failed");
//            }
//        };
//
//        Filter businessFilter = (request, response, chain) -> {
//            System.out.println("Business filter processing request: " + request.payload());
//            chain.executeFilterChain(request, new Response(true, "Business processed data"));
//            System.out.println("Business filter finished processing");
//        };
//
//
//        FilterManager.addFilter(loggingFilter);
//        FilterManager.addFilter(authFilter);
//        FilterManager.addFilter(businessFilter);
//
//
//        FilterChain filterChain = new FilterChain(FilterManager.getFilters());
//
//        filterChain.executeFilterChain(new Request("Do something with AUTH"), new Response(false, ""));


    }
}
