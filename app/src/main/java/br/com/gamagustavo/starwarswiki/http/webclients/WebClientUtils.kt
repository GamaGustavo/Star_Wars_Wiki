package br.com.gamagustavo.starwarswiki.http.webclients

import br.com.gamagustavo.starwarswiki.http.interceptor.LoggingInterceptor
import com.github.kittinunf.fuel.core.HttpException
import com.github.kittinunf.fuel.core.Parameters
import com.github.kittinunf.fuel.httpGet
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


object WebClientUtils {

    suspend fun get(path: String): String {
        return get(path, null)
    }

    suspend fun get(path: String, parameters: Parameters?): String {
        return withContext(Dispatchers.Default) {
            val (request, response, result) = path.httpGet(parameters).response()
            val interceptor = LoggingInterceptor()
            interceptor.interceptRequest(request)

            if (response.statusCode in 200..299) {
                interceptor.interceptResponse(response)
                val (bytes, error) = result
                if (bytes != null) return@withContext String(bytes)
                if (error != null) throw error
            }
            throw HttpException(response.statusCode, response.responseMessage)
        }
    }
}