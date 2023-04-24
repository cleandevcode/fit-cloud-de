package sn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.URI;
import java.net.URISyntaxException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import sn.a;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a */
    public InputStream f27369a;

    /* renamed from: b */
    public OutputStream f27370b;

    /* renamed from: c */
    public String f27371c;

    /* renamed from: d */
    public String f27372d;

    /* renamed from: e */
    public int f27373e;

    public d(InputStream inputStream, OutputStream outputStream, String str, String str2, int i10) {
        this.f27369a = inputStream;
        this.f27370b = outputStream;
        this.f27371c = str;
        this.f27372d = str2;
        this.f27373e = i10;
    }

    public static void b(String str) {
        StringBuffer stringBuffer = new StringBuffer(String.valueOf(str));
        stringBuffer.append("258EAFA5-E914-47DA-95CA-C5AB0DC85B11");
        byte[] digest = MessageDigest.getInstance("SHA1").digest(stringBuffer.toString().getBytes());
        a.C0490a c0490a = a.f27363a;
        c0490a.putByteArray("aKey", digest);
        String trim = c0490a.f27364a.trim();
        if (trim.equals(trim)) {
            return;
        }
        throw new b();
    }

    public final void a() {
        StringBuffer stringBuffer = new StringBuffer("mqtt-");
        stringBuffer.append(System.currentTimeMillis() / 1000);
        String stringBuffer2 = stringBuffer.toString();
        a.C0490a c0490a = a.f27363a;
        c0490a.putByteArray("akey", stringBuffer2.getBytes());
        String str = c0490a.f27364a;
        try {
            String str2 = "/mqtt";
            URI uri = new URI(this.f27371c);
            if (uri.getRawPath() != null && !uri.getRawPath().isEmpty()) {
                str2 = uri.getRawPath();
                if (uri.getRawQuery() != null && !uri.getRawQuery().isEmpty()) {
                    StringBuffer stringBuffer3 = new StringBuffer(String.valueOf(str2));
                    stringBuffer3.append("?");
                    stringBuffer3.append(uri.getRawQuery());
                    str2 = stringBuffer3.toString();
                }
            }
            PrintWriter printWriter = new PrintWriter(this.f27370b);
            StringBuffer stringBuffer4 = new StringBuffer("GET ");
            stringBuffer4.append(str2);
            stringBuffer4.append(" HTTP/1.1");
            stringBuffer4.append("\r\n");
            printWriter.print(stringBuffer4.toString());
            StringBuffer stringBuffer5 = new StringBuffer("Host: ");
            stringBuffer5.append(this.f27372d);
            stringBuffer5.append(":");
            stringBuffer5.append(this.f27373e);
            stringBuffer5.append("\r\n");
            printWriter.print(stringBuffer5.toString());
            printWriter.print("Upgrade: websocket\r\n");
            printWriter.print("Connection: Upgrade\r\n");
            StringBuffer stringBuffer6 = new StringBuffer("Sec-WebSocket-Key: ");
            stringBuffer6.append(str);
            stringBuffer6.append("\r\n");
            printWriter.print(stringBuffer6.toString());
            printWriter.print("Sec-WebSocket-Protocol: mqttv3.1\r\n");
            printWriter.print("Sec-WebSocket-Version: 13\r\n");
            printWriter.print("\r\n");
            printWriter.flush();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.f27369a));
            ArrayList arrayList = new ArrayList();
            String readLine = bufferedReader.readLine();
            if (readLine != null) {
                while (!readLine.equals("")) {
                    arrayList.add(readLine);
                    readLine = bufferedReader.readLine();
                }
                HashMap hashMap = new HashMap();
                for (int i10 = 1; i10 < arrayList.size(); i10++) {
                    String[] split = ((String) arrayList.get(i10)).split(":");
                    hashMap.put(split[0].toLowerCase(), split[1]);
                }
                String str3 = (String) hashMap.get("connection");
                if (str3 != null && !str3.equalsIgnoreCase("upgrade")) {
                    if (((String) hashMap.get("upgrade")).toLowerCase().contains("websocket")) {
                        if (((String) hashMap.get("sec-websocket-protocol")) != null) {
                            if (hashMap.containsKey("sec-websocket-accept")) {
                                try {
                                    String str4 = (String) hashMap.get("sec-websocket-accept");
                                    b(str);
                                    return;
                                } catch (NoSuchAlgorithmException e10) {
                                    throw new IOException(e10.getMessage());
                                } catch (b unused) {
                                    throw new IOException("WebSocket Response header: Incorrect Sec-WebSocket-Key");
                                }
                            }
                            throw new IOException("WebSocket Response header: Missing Sec-WebSocket-Accept");
                        }
                        throw new IOException("WebSocket Response header: empty sec-websocket-protocol");
                    }
                    throw new IOException("WebSocket Response header: Incorrect upgrade.");
                }
                throw new IOException("WebSocket Response header: Incorrect connection header");
            }
            throw new IOException("WebSocket Response header: Invalid response from Server, It may not support WebSockets.");
        } catch (URISyntaxException e11) {
            throw new IllegalStateException(e11);
        }
    }
}
