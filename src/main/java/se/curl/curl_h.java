// Generated by jextract

package se.curl;

import java.lang.invoke.*;
import java.lang.foreign.*;
import java.nio.ByteOrder;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

import static java.lang.foreign.ValueLayout.*;
import static java.lang.foreign.MemoryLayout.PathElement.*;

public class curl_h extends curl_h_1 {

    curl_h() {
        // Should not be called directly
    }
    private static final int CURLOPTTYPE_VALUES = (int)0L;
    /**
     * {@snippet lang=c :
     * #define CURLOPTTYPE_VALUES 0
     * }
     */
    public static int CURLOPTTYPE_VALUES() {
        return CURLOPTTYPE_VALUES;
    }
    private static final int CURLOPT_PROGRESSDATA = (int)10057L;
    /**
     * {@snippet lang=c :
     * #define CURLOPT_PROGRESSDATA 10057
     * }
     */
    public static int CURLOPT_PROGRESSDATA() {
        return CURLOPT_PROGRESSDATA;
    }
    private static final int CURLOPT_POST301 = (int)161L;
    /**
     * {@snippet lang=c :
     * #define CURLOPT_POST301 161
     * }
     */
    public static int CURLOPT_POST301() {
        return CURLOPT_POST301;
    }
    private static final int CURLOPT_SSLKEYPASSWD = (int)10026L;
    /**
     * {@snippet lang=c :
     * #define CURLOPT_SSLKEYPASSWD 10026
     * }
     */
    public static int CURLOPT_SSLKEYPASSWD() {
        return CURLOPT_SSLKEYPASSWD;
    }
    private static final int CURLOPT_FTPAPPEND = (int)50L;
    /**
     * {@snippet lang=c :
     * #define CURLOPT_FTPAPPEND 50
     * }
     */
    public static int CURLOPT_FTPAPPEND() {
        return CURLOPT_FTPAPPEND;
    }
    private static final int CURLOPT_FTPLISTONLY = (int)48L;
    /**
     * {@snippet lang=c :
     * #define CURLOPT_FTPLISTONLY 48
     * }
     */
    public static int CURLOPT_FTPLISTONLY() {
        return CURLOPT_FTPLISTONLY;
    }
    private static final int CURLOPT_FTP_SSL = (int)119L;
    /**
     * {@snippet lang=c :
     * #define CURLOPT_FTP_SSL 119
     * }
     */
    public static int CURLOPT_FTP_SSL() {
        return CURLOPT_FTP_SSL;
    }
    private static final int CURLOPT_SSLCERTPASSWD = (int)10026L;
    /**
     * {@snippet lang=c :
     * #define CURLOPT_SSLCERTPASSWD 10026
     * }
     */
    public static int CURLOPT_SSLCERTPASSWD() {
        return CURLOPT_SSLCERTPASSWD;
    }
    private static final int CURLOPT_KRB4LEVEL = (int)10063L;
    /**
     * {@snippet lang=c :
     * #define CURLOPT_KRB4LEVEL 10063
     * }
     */
    public static int CURLOPT_KRB4LEVEL() {
        return CURLOPT_KRB4LEVEL;
    }
    private static final int CURLOPT_FTP_RESPONSE_TIMEOUT = (int)112L;
    /**
     * {@snippet lang=c :
     * #define CURLOPT_FTP_RESPONSE_TIMEOUT 112
     * }
     */
    public static int CURLOPT_FTP_RESPONSE_TIMEOUT() {
        return CURLOPT_FTP_RESPONSE_TIMEOUT;
    }
    private static final int CURLOPT_MAIL_RCPT_ALLLOWFAILS = (int)290L;
    /**
     * {@snippet lang=c :
     * #define CURLOPT_MAIL_RCPT_ALLLOWFAILS 290
     * }
     */
    public static int CURLOPT_MAIL_RCPT_ALLLOWFAILS() {
        return CURLOPT_MAIL_RCPT_ALLLOWFAILS;
    }
    private static final int CURLOPT_RTSPHEADER = (int)10023L;
    /**
     * {@snippet lang=c :
     * #define CURLOPT_RTSPHEADER 10023
     * }
     */
    public static int CURLOPT_RTSPHEADER() {
        return CURLOPT_RTSPHEADER;
    }
    private static final int CURL_HTTP_VERSION_2 = (int)3L;
    /**
     * {@snippet lang=c :
     * #define CURL_HTTP_VERSION_2 3
     * }
     */
    public static int CURL_HTTP_VERSION_2() {
        return CURL_HTTP_VERSION_2;
    }
    private static final int CURL_SSLVERSION_MAX_DEFAULT = (int)65536L;
    /**
     * {@snippet lang=c :
     * #define CURL_SSLVERSION_MAX_DEFAULT 65536
     * }
     */
    public static int CURL_SSLVERSION_MAX_DEFAULT() {
        return CURL_SSLVERSION_MAX_DEFAULT;
    }
    private static final int CURL_SSLVERSION_MAX_TLSv1_0 = (int)262144L;
    /**
     * {@snippet lang=c :
     * #define CURL_SSLVERSION_MAX_TLSv1_0 262144
     * }
     */
    public static int CURL_SSLVERSION_MAX_TLSv1_0() {
        return CURL_SSLVERSION_MAX_TLSv1_0;
    }
    private static final int CURL_SSLVERSION_MAX_TLSv1_1 = (int)327680L;
    /**
     * {@snippet lang=c :
     * #define CURL_SSLVERSION_MAX_TLSv1_1 327680
     * }
     */
    public static int CURL_SSLVERSION_MAX_TLSv1_1() {
        return CURL_SSLVERSION_MAX_TLSv1_1;
    }
    private static final int CURL_SSLVERSION_MAX_TLSv1_2 = (int)393216L;
    /**
     * {@snippet lang=c :
     * #define CURL_SSLVERSION_MAX_TLSv1_2 393216
     * }
     */
    public static int CURL_SSLVERSION_MAX_TLSv1_2() {
        return CURL_SSLVERSION_MAX_TLSv1_2;
    }
    private static final int CURL_SSLVERSION_MAX_TLSv1_3 = (int)458752L;
    /**
     * {@snippet lang=c :
     * #define CURL_SSLVERSION_MAX_TLSv1_3 458752
     * }
     */
    public static int CURL_SSLVERSION_MAX_TLSv1_3() {
        return CURL_SSLVERSION_MAX_TLSv1_3;
    }
    private static final int CURL_SSLVERSION_MAX_LAST = (int)524288L;
    /**
     * {@snippet lang=c :
     * #define CURL_SSLVERSION_MAX_LAST 524288
     * }
     */
    public static int CURL_SSLVERSION_MAX_LAST() {
        return CURL_SSLVERSION_MAX_LAST;
    }
    private static final int CURL_REDIR_POST_ALL = (int)7L;
    /**
     * {@snippet lang=c :
     * #define CURL_REDIR_POST_ALL 7
     * }
     */
    public static int CURL_REDIR_POST_ALL() {
        return CURL_REDIR_POST_ALL;
    }
    private static final long CURL_ZERO_TERMINATED = -1L;
    /**
     * {@snippet lang=c :
     * #define CURL_ZERO_TERMINATED -1
     * }
     */
    public static long CURL_ZERO_TERMINATED() {
        return CURL_ZERO_TERMINATED;
    }
    private static final int CURLMIMEOPT_FORMESCAPE = (int)1L;
    /**
     * {@snippet lang=c :
     * #define CURLMIMEOPT_FORMESCAPE 1
     * }
     */
    public static int CURLMIMEOPT_FORMESCAPE() {
        return CURLMIMEOPT_FORMESCAPE;
    }
    private static final int CURLINFO_HTTP_CODE = (int)2097154L;
    /**
     * {@snippet lang=c :
     * #define CURLINFO_HTTP_CODE 2097154
     * }
     */
    public static int CURLINFO_HTTP_CODE() {
        return CURLINFO_HTTP_CODE;
    }
    private static final int CURL_GLOBAL_SSL = (int)1L;
    /**
     * {@snippet lang=c :
     * #define CURL_GLOBAL_SSL 1
     * }
     */
    public static int CURL_GLOBAL_SSL() {
        return CURL_GLOBAL_SSL;
    }
    private static final int CURL_GLOBAL_WIN32 = (int)2L;
    /**
     * {@snippet lang=c :
     * #define CURL_GLOBAL_WIN32 2
     * }
     */
    public static int CURL_GLOBAL_WIN32() {
        return CURL_GLOBAL_WIN32;
    }
    private static final int CURL_GLOBAL_ALL = (int)3L;
    /**
     * {@snippet lang=c :
     * #define CURL_GLOBAL_ALL 3
     * }
     */
    public static int CURL_GLOBAL_ALL() {
        return CURL_GLOBAL_ALL;
    }
    private static final int CURL_GLOBAL_DEFAULT = (int)3L;
    /**
     * {@snippet lang=c :
     * #define CURL_GLOBAL_DEFAULT 3
     * }
     */
    public static int CURL_GLOBAL_DEFAULT() {
        return CURL_GLOBAL_DEFAULT;
    }
    private static final int CURL_GLOBAL_ACK_EINTR = (int)4L;
    /**
     * {@snippet lang=c :
     * #define CURL_GLOBAL_ACK_EINTR 4
     * }
     */
    public static int CURL_GLOBAL_ACK_EINTR() {
        return CURL_GLOBAL_ACK_EINTR;
    }
    private static final int CURLVERSION_NOW = (int)11L;
    /**
     * {@snippet lang=c :
     * #define CURLVERSION_NOW 11
     * }
     */
    public static int CURLVERSION_NOW() {
        return CURLVERSION_NOW;
    }
    private static final int CURL_VERSION_IPV6 = (int)1L;
    /**
     * {@snippet lang=c :
     * #define CURL_VERSION_IPV6 1
     * }
     */
    public static int CURL_VERSION_IPV6() {
        return CURL_VERSION_IPV6;
    }
    private static final int CURL_VERSION_KERBEROS4 = (int)2L;
    /**
     * {@snippet lang=c :
     * #define CURL_VERSION_KERBEROS4 2
     * }
     */
    public static int CURL_VERSION_KERBEROS4() {
        return CURL_VERSION_KERBEROS4;
    }
    private static final int CURL_VERSION_SSL = (int)4L;
    /**
     * {@snippet lang=c :
     * #define CURL_VERSION_SSL 4
     * }
     */
    public static int CURL_VERSION_SSL() {
        return CURL_VERSION_SSL;
    }
    private static final int CURL_VERSION_LIBZ = (int)8L;
    /**
     * {@snippet lang=c :
     * #define CURL_VERSION_LIBZ 8
     * }
     */
    public static int CURL_VERSION_LIBZ() {
        return CURL_VERSION_LIBZ;
    }
    private static final int CURL_VERSION_NTLM = (int)16L;
    /**
     * {@snippet lang=c :
     * #define CURL_VERSION_NTLM 16
     * }
     */
    public static int CURL_VERSION_NTLM() {
        return CURL_VERSION_NTLM;
    }
    private static final int CURL_VERSION_GSSNEGOTIATE = (int)32L;
    /**
     * {@snippet lang=c :
     * #define CURL_VERSION_GSSNEGOTIATE 32
     * }
     */
    public static int CURL_VERSION_GSSNEGOTIATE() {
        return CURL_VERSION_GSSNEGOTIATE;
    }
    private static final int CURL_VERSION_DEBUG = (int)64L;
    /**
     * {@snippet lang=c :
     * #define CURL_VERSION_DEBUG 64
     * }
     */
    public static int CURL_VERSION_DEBUG() {
        return CURL_VERSION_DEBUG;
    }
    private static final int CURL_VERSION_ASYNCHDNS = (int)128L;
    /**
     * {@snippet lang=c :
     * #define CURL_VERSION_ASYNCHDNS 128
     * }
     */
    public static int CURL_VERSION_ASYNCHDNS() {
        return CURL_VERSION_ASYNCHDNS;
    }
    private static final int CURL_VERSION_SPNEGO = (int)256L;
    /**
     * {@snippet lang=c :
     * #define CURL_VERSION_SPNEGO 256
     * }
     */
    public static int CURL_VERSION_SPNEGO() {
        return CURL_VERSION_SPNEGO;
    }
    private static final int CURL_VERSION_LARGEFILE = (int)512L;
    /**
     * {@snippet lang=c :
     * #define CURL_VERSION_LARGEFILE 512
     * }
     */
    public static int CURL_VERSION_LARGEFILE() {
        return CURL_VERSION_LARGEFILE;
    }
    private static final int CURL_VERSION_IDN = (int)1024L;
    /**
     * {@snippet lang=c :
     * #define CURL_VERSION_IDN 1024
     * }
     */
    public static int CURL_VERSION_IDN() {
        return CURL_VERSION_IDN;
    }
    private static final int CURL_VERSION_SSPI = (int)2048L;
    /**
     * {@snippet lang=c :
     * #define CURL_VERSION_SSPI 2048
     * }
     */
    public static int CURL_VERSION_SSPI() {
        return CURL_VERSION_SSPI;
    }
    private static final int CURL_VERSION_CONV = (int)4096L;
    /**
     * {@snippet lang=c :
     * #define CURL_VERSION_CONV 4096
     * }
     */
    public static int CURL_VERSION_CONV() {
        return CURL_VERSION_CONV;
    }
    private static final int CURL_VERSION_CURLDEBUG = (int)8192L;
    /**
     * {@snippet lang=c :
     * #define CURL_VERSION_CURLDEBUG 8192
     * }
     */
    public static int CURL_VERSION_CURLDEBUG() {
        return CURL_VERSION_CURLDEBUG;
    }
    private static final int CURL_VERSION_TLSAUTH_SRP = (int)16384L;
    /**
     * {@snippet lang=c :
     * #define CURL_VERSION_TLSAUTH_SRP 16384
     * }
     */
    public static int CURL_VERSION_TLSAUTH_SRP() {
        return CURL_VERSION_TLSAUTH_SRP;
    }
    private static final int CURL_VERSION_NTLM_WB = (int)32768L;
    /**
     * {@snippet lang=c :
     * #define CURL_VERSION_NTLM_WB 32768
     * }
     */
    public static int CURL_VERSION_NTLM_WB() {
        return CURL_VERSION_NTLM_WB;
    }
    private static final int CURL_VERSION_HTTP2 = (int)65536L;
    /**
     * {@snippet lang=c :
     * #define CURL_VERSION_HTTP2 65536
     * }
     */
    public static int CURL_VERSION_HTTP2() {
        return CURL_VERSION_HTTP2;
    }
    private static final int CURL_VERSION_GSSAPI = (int)131072L;
    /**
     * {@snippet lang=c :
     * #define CURL_VERSION_GSSAPI 131072
     * }
     */
    public static int CURL_VERSION_GSSAPI() {
        return CURL_VERSION_GSSAPI;
    }
    private static final int CURL_VERSION_KERBEROS5 = (int)262144L;
    /**
     * {@snippet lang=c :
     * #define CURL_VERSION_KERBEROS5 262144
     * }
     */
    public static int CURL_VERSION_KERBEROS5() {
        return CURL_VERSION_KERBEROS5;
    }
    private static final int CURL_VERSION_UNIX_SOCKETS = (int)524288L;
    /**
     * {@snippet lang=c :
     * #define CURL_VERSION_UNIX_SOCKETS 524288
     * }
     */
    public static int CURL_VERSION_UNIX_SOCKETS() {
        return CURL_VERSION_UNIX_SOCKETS;
    }
    private static final int CURL_VERSION_PSL = (int)1048576L;
    /**
     * {@snippet lang=c :
     * #define CURL_VERSION_PSL 1048576
     * }
     */
    public static int CURL_VERSION_PSL() {
        return CURL_VERSION_PSL;
    }
    private static final int CURL_VERSION_HTTPS_PROXY = (int)2097152L;
    /**
     * {@snippet lang=c :
     * #define CURL_VERSION_HTTPS_PROXY 2097152
     * }
     */
    public static int CURL_VERSION_HTTPS_PROXY() {
        return CURL_VERSION_HTTPS_PROXY;
    }
    private static final int CURL_VERSION_MULTI_SSL = (int)4194304L;
    /**
     * {@snippet lang=c :
     * #define CURL_VERSION_MULTI_SSL 4194304
     * }
     */
    public static int CURL_VERSION_MULTI_SSL() {
        return CURL_VERSION_MULTI_SSL;
    }
    private static final int CURL_VERSION_BROTLI = (int)8388608L;
    /**
     * {@snippet lang=c :
     * #define CURL_VERSION_BROTLI 8388608
     * }
     */
    public static int CURL_VERSION_BROTLI() {
        return CURL_VERSION_BROTLI;
    }
    private static final int CURL_VERSION_ALTSVC = (int)16777216L;
    /**
     * {@snippet lang=c :
     * #define CURL_VERSION_ALTSVC 16777216
     * }
     */
    public static int CURL_VERSION_ALTSVC() {
        return CURL_VERSION_ALTSVC;
    }
    private static final int CURL_VERSION_HTTP3 = (int)33554432L;
    /**
     * {@snippet lang=c :
     * #define CURL_VERSION_HTTP3 33554432
     * }
     */
    public static int CURL_VERSION_HTTP3() {
        return CURL_VERSION_HTTP3;
    }
    private static final int CURL_VERSION_ZSTD = (int)67108864L;
    /**
     * {@snippet lang=c :
     * #define CURL_VERSION_ZSTD 67108864
     * }
     */
    public static int CURL_VERSION_ZSTD() {
        return CURL_VERSION_ZSTD;
    }
    private static final int CURL_VERSION_UNICODE = (int)134217728L;
    /**
     * {@snippet lang=c :
     * #define CURL_VERSION_UNICODE 134217728
     * }
     */
    public static int CURL_VERSION_UNICODE() {
        return CURL_VERSION_UNICODE;
    }
    private static final int CURL_VERSION_HSTS = (int)268435456L;
    /**
     * {@snippet lang=c :
     * #define CURL_VERSION_HSTS 268435456
     * }
     */
    public static int CURL_VERSION_HSTS() {
        return CURL_VERSION_HSTS;
    }
    private static final int CURL_VERSION_GSASL = (int)536870912L;
    /**
     * {@snippet lang=c :
     * #define CURL_VERSION_GSASL 536870912
     * }
     */
    public static int CURL_VERSION_GSASL() {
        return CURL_VERSION_GSASL;
    }
    private static final int CURL_VERSION_THREADSAFE = (int)1073741824L;
    /**
     * {@snippet lang=c :
     * #define CURL_VERSION_THREADSAFE 1073741824
     * }
     */
    public static int CURL_VERSION_THREADSAFE() {
        return CURL_VERSION_THREADSAFE;
    }
    private static final int CURLPAUSE_RECV = (int)1L;
    /**
     * {@snippet lang=c :
     * #define CURLPAUSE_RECV 1
     * }
     */
    public static int CURLPAUSE_RECV() {
        return CURLPAUSE_RECV;
    }
    private static final int CURLPAUSE_RECV_CONT = (int)0L;
    /**
     * {@snippet lang=c :
     * #define CURLPAUSE_RECV_CONT 0
     * }
     */
    public static int CURLPAUSE_RECV_CONT() {
        return CURLPAUSE_RECV_CONT;
    }
    private static final int CURLPAUSE_SEND = (int)4L;
    /**
     * {@snippet lang=c :
     * #define CURLPAUSE_SEND 4
     * }
     */
    public static int CURLPAUSE_SEND() {
        return CURLPAUSE_SEND;
    }
    private static final int CURLPAUSE_SEND_CONT = (int)0L;
    /**
     * {@snippet lang=c :
     * #define CURLPAUSE_SEND_CONT 0
     * }
     */
    public static int CURLPAUSE_SEND_CONT() {
        return CURLPAUSE_SEND_CONT;
    }
    private static final int CURLPAUSE_ALL = (int)5L;
    /**
     * {@snippet lang=c :
     * #define CURLPAUSE_ALL 5
     * }
     */
    public static int CURLPAUSE_ALL() {
        return CURLPAUSE_ALL;
    }
    private static final int CURLPAUSE_CONT = (int)0L;
    /**
     * {@snippet lang=c :
     * #define CURLPAUSE_CONT 0
     * }
     */
    public static int CURLPAUSE_CONT() {
        return CURLPAUSE_CONT;
    }
    private static final int CURLM_CALL_MULTI_SOCKET = (int)-1L;
    /**
     * {@snippet lang=c :
     * #define CURLM_CALL_MULTI_SOCKET -1
     * }
     */
    public static int CURLM_CALL_MULTI_SOCKET() {
        return CURLM_CALL_MULTI_SOCKET;
    }
    private static final long CURLPIPE_NOTHING = 0L;
    /**
     * {@snippet lang=c :
     * #define CURLPIPE_NOTHING 0
     * }
     */
    public static long CURLPIPE_NOTHING() {
        return CURLPIPE_NOTHING;
    }
    private static final long CURLPIPE_HTTP1 = 1L;
    /**
     * {@snippet lang=c :
     * #define CURLPIPE_HTTP1 1
     * }
     */
    public static long CURLPIPE_HTTP1() {
        return CURLPIPE_HTTP1;
    }
    private static final long CURLPIPE_MULTIPLEX = 2L;
    /**
     * {@snippet lang=c :
     * #define CURLPIPE_MULTIPLEX 2
     * }
     */
    public static long CURLPIPE_MULTIPLEX() {
        return CURLPIPE_MULTIPLEX;
    }
    private static final int CURL_SOCKET_TIMEOUT = (int)-1L;
    /**
     * {@snippet lang=c :
     * #define CURL_SOCKET_TIMEOUT -1
     * }
     */
    public static int CURL_SOCKET_TIMEOUT() {
        return CURL_SOCKET_TIMEOUT;
    }
    private static final int CURLU_DEFAULT_PORT = (int)1L;
    /**
     * {@snippet lang=c :
     * #define CURLU_DEFAULT_PORT 1
     * }
     */
    public static int CURLU_DEFAULT_PORT() {
        return CURLU_DEFAULT_PORT;
    }
    private static final int CURLU_NO_DEFAULT_PORT = (int)2L;
    /**
     * {@snippet lang=c :
     * #define CURLU_NO_DEFAULT_PORT 2
     * }
     */
    public static int CURLU_NO_DEFAULT_PORT() {
        return CURLU_NO_DEFAULT_PORT;
    }
    private static final int CURLU_DEFAULT_SCHEME = (int)4L;
    /**
     * {@snippet lang=c :
     * #define CURLU_DEFAULT_SCHEME 4
     * }
     */
    public static int CURLU_DEFAULT_SCHEME() {
        return CURLU_DEFAULT_SCHEME;
    }
    private static final int CURLU_NON_SUPPORT_SCHEME = (int)8L;
    /**
     * {@snippet lang=c :
     * #define CURLU_NON_SUPPORT_SCHEME 8
     * }
     */
    public static int CURLU_NON_SUPPORT_SCHEME() {
        return CURLU_NON_SUPPORT_SCHEME;
    }
    private static final int CURLU_PATH_AS_IS = (int)16L;
    /**
     * {@snippet lang=c :
     * #define CURLU_PATH_AS_IS 16
     * }
     */
    public static int CURLU_PATH_AS_IS() {
        return CURLU_PATH_AS_IS;
    }
    private static final int CURLU_DISALLOW_USER = (int)32L;
    /**
     * {@snippet lang=c :
     * #define CURLU_DISALLOW_USER 32
     * }
     */
    public static int CURLU_DISALLOW_USER() {
        return CURLU_DISALLOW_USER;
    }
    private static final int CURLU_URLDECODE = (int)64L;
    /**
     * {@snippet lang=c :
     * #define CURLU_URLDECODE 64
     * }
     */
    public static int CURLU_URLDECODE() {
        return CURLU_URLDECODE;
    }
    private static final int CURLU_URLENCODE = (int)128L;
    /**
     * {@snippet lang=c :
     * #define CURLU_URLENCODE 128
     * }
     */
    public static int CURLU_URLENCODE() {
        return CURLU_URLENCODE;
    }
    private static final int CURLU_APPENDQUERY = (int)256L;
    /**
     * {@snippet lang=c :
     * #define CURLU_APPENDQUERY 256
     * }
     */
    public static int CURLU_APPENDQUERY() {
        return CURLU_APPENDQUERY;
    }
    private static final int CURLU_GUESS_SCHEME = (int)512L;
    /**
     * {@snippet lang=c :
     * #define CURLU_GUESS_SCHEME 512
     * }
     */
    public static int CURLU_GUESS_SCHEME() {
        return CURLU_GUESS_SCHEME;
    }
    private static final int CURLU_NO_AUTHORITY = (int)1024L;
    /**
     * {@snippet lang=c :
     * #define CURLU_NO_AUTHORITY 1024
     * }
     */
    public static int CURLU_NO_AUTHORITY() {
        return CURLU_NO_AUTHORITY;
    }
    private static final int CURLU_ALLOW_SPACE = (int)2048L;
    /**
     * {@snippet lang=c :
     * #define CURLU_ALLOW_SPACE 2048
     * }
     */
    public static int CURLU_ALLOW_SPACE() {
        return CURLU_ALLOW_SPACE;
    }
    private static final int CURLU_PUNYCODE = (int)4096L;
    /**
     * {@snippet lang=c :
     * #define CURLU_PUNYCODE 4096
     * }
     */
    public static int CURLU_PUNYCODE() {
        return CURLU_PUNYCODE;
    }
    private static final int CURLU_PUNY2IDN = (int)8192L;
    /**
     * {@snippet lang=c :
     * #define CURLU_PUNY2IDN 8192
     * }
     */
    public static int CURLU_PUNY2IDN() {
        return CURLU_PUNY2IDN;
    }
    private static final int CURLU_GET_EMPTY = (int)16384L;
    /**
     * {@snippet lang=c :
     * #define CURLU_GET_EMPTY 16384
     * }
     */
    public static int CURLU_GET_EMPTY() {
        return CURLU_GET_EMPTY;
    }
    private static final int CURLU_NO_GUESS_SCHEME = (int)32768L;
    /**
     * {@snippet lang=c :
     * #define CURLU_NO_GUESS_SCHEME 32768
     * }
     */
    public static int CURLU_NO_GUESS_SCHEME() {
        return CURLU_NO_GUESS_SCHEME;
    }
    private static final int CURLOT_FLAG_ALIAS = (int)1L;
    /**
     * {@snippet lang=c :
     * #define CURLOT_FLAG_ALIAS 1
     * }
     */
    public static int CURLOT_FLAG_ALIAS() {
        return CURLOT_FLAG_ALIAS;
    }
    private static final int CURLH_HEADER = (int)1L;
    /**
     * {@snippet lang=c :
     * #define CURLH_HEADER 1
     * }
     */
    public static int CURLH_HEADER() {
        return CURLH_HEADER;
    }
    private static final int CURLH_TRAILER = (int)2L;
    /**
     * {@snippet lang=c :
     * #define CURLH_TRAILER 2
     * }
     */
    public static int CURLH_TRAILER() {
        return CURLH_TRAILER;
    }
    private static final int CURLH_CONNECT = (int)4L;
    /**
     * {@snippet lang=c :
     * #define CURLH_CONNECT 4
     * }
     */
    public static int CURLH_CONNECT() {
        return CURLH_CONNECT;
    }
    private static final int CURLH_1XX = (int)8L;
    /**
     * {@snippet lang=c :
     * #define CURLH_1XX 8
     * }
     */
    public static int CURLH_1XX() {
        return CURLH_1XX;
    }
    private static final int CURLH_PSEUDO = (int)16L;
    /**
     * {@snippet lang=c :
     * #define CURLH_PSEUDO 16
     * }
     */
    public static int CURLH_PSEUDO() {
        return CURLH_PSEUDO;
    }
    private static final int CURLWS_TEXT = (int)1L;
    /**
     * {@snippet lang=c :
     * #define CURLWS_TEXT 1
     * }
     */
    public static int CURLWS_TEXT() {
        return CURLWS_TEXT;
    }
    private static final int CURLWS_BINARY = (int)2L;
    /**
     * {@snippet lang=c :
     * #define CURLWS_BINARY 2
     * }
     */
    public static int CURLWS_BINARY() {
        return CURLWS_BINARY;
    }
    private static final int CURLWS_CONT = (int)4L;
    /**
     * {@snippet lang=c :
     * #define CURLWS_CONT 4
     * }
     */
    public static int CURLWS_CONT() {
        return CURLWS_CONT;
    }
    private static final int CURLWS_CLOSE = (int)8L;
    /**
     * {@snippet lang=c :
     * #define CURLWS_CLOSE 8
     * }
     */
    public static int CURLWS_CLOSE() {
        return CURLWS_CLOSE;
    }
    private static final int CURLWS_PING = (int)16L;
    /**
     * {@snippet lang=c :
     * #define CURLWS_PING 16
     * }
     */
    public static int CURLWS_PING() {
        return CURLWS_PING;
    }
    private static final int CURLWS_OFFSET = (int)32L;
    /**
     * {@snippet lang=c :
     * #define CURLWS_OFFSET 32
     * }
     */
    public static int CURLWS_OFFSET() {
        return CURLWS_OFFSET;
    }
    private static final int CURLWS_PONG = (int)64L;
    /**
     * {@snippet lang=c :
     * #define CURLWS_PONG 64
     * }
     */
    public static int CURLWS_PONG() {
        return CURLWS_PONG;
    }
    private static final int CURLWS_RAW_MODE = (int)1L;
    /**
     * {@snippet lang=c :
     * #define CURLWS_RAW_MODE 1
     * }
     */
    public static int CURLWS_RAW_MODE() {
        return CURLWS_RAW_MODE;
    }
}

