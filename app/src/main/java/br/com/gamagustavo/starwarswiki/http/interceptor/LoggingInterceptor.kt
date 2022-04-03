package br.com.gamagustavo.starwarswiki.http.interceptor

import com.github.kittinunf.fuel.core.Request
import com.github.kittinunf.fuel.core.Response

class LoggingInterceptor {

    fun interceptRequest(request: Request): Request {
        println("[Request] $request")
        return request
    }

    fun interceptResponse(response: Response): Response {
        println("[Response] $response")
        return response
    }

}