package dev.kosmx.darkjava.ffm;

import lombok.Cleanup;
import se.curl.*;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;

public class GetCurl {
    //https://curl.se/libcurl/c/https.html
    public static void main(String[] args) {
        // @Cleanup is from Lombok
        @Cleanup Arena arena = Arena.ofConfined();

        MemorySegment curl;
        int res;

        curl_h.curl_global_init(curl_h.CURL_GLOBAL_DEFAULT());

        curl = curl_h.curl_easy_init();
        if (curl.address() != 0) {

            var url = arena.allocateFrom("https://kosmx.dev/");

            var curl_easy_setopt = curl_h_1.curl_easy_setopt.makeInvoker(ValueLayout.ADDRESS); // I have to configure variadic function before invoking
            curl_easy_setopt.apply(curl, curl_h.CURLOPT_URL(), url);

            res = curl_h.curl_easy_perform(curl);
            if (res != curl_h.CURLE_OK()) {
                System.err.printf("curl_easy_perform() failed %s\n", curl_h.curl_easy_strerror(res).getString(0));
            }
            curl_h.curl_easy_cleanup(curl);
        }
        curl_h.curl_global_cleanup();
    }
}
