package pn;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Enumeration;
import java.util.Properties;

/* loaded from: classes2.dex */
public final class l {

    /* renamed from: c */
    public String f24440c;

    /* renamed from: d */
    public char[] f24441d;

    /* renamed from: a */
    public int f24438a = 60;

    /* renamed from: b */
    public int f24439b = 10;

    /* renamed from: e */
    public int f24442e = 0;

    /* renamed from: f */
    public boolean f24443f = false;

    public static int b(String str) {
        try {
            URI uri = new URI(str);
            if (uri.getScheme().equals("ws")) {
                return 3;
            }
            if (uri.getScheme().equals("wss")) {
                return 4;
            }
            if (uri.getPath().equals("")) {
                if (uri.getScheme().equals("tcp")) {
                    return 0;
                }
                if (uri.getScheme().equals("ssl")) {
                    return 1;
                }
                if (uri.getScheme().equals("local")) {
                    return 2;
                }
                throw new IllegalArgumentException(str);
            }
            throw new IllegalArgumentException(str);
        } catch (URISyntaxException unused) {
            throw new IllegalArgumentException(str);
        }
    }

    public final void a(int i10) {
        if (i10 != 0 && i10 != 3 && i10 != 4) {
            throw new IllegalArgumentException();
        }
        this.f24442e = i10;
    }

    public final String toString() {
        String stringBuffer;
        Properties properties = new Properties();
        properties.put("MqttVersion", new Integer(this.f24442e));
        properties.put("CleanSession", Boolean.TRUE);
        properties.put("ConTimeout", new Integer(30));
        properties.put("KeepAliveInterval", new Integer(this.f24438a));
        String str = this.f24440c;
        if (str == null) {
            str = "null";
        }
        properties.put("UserName", str);
        properties.put("WillDestination", "null");
        properties.put("SocketFactory", "null");
        properties.put("SSLProperties", "null");
        un.b bVar = wn.a.f30065a;
        StringBuffer stringBuffer2 = new StringBuffer();
        Enumeration<?> propertyNames = properties.propertyNames();
        String str2 = wn.a.f30066b;
        StringBuffer stringBuffer3 = new StringBuffer(String.valueOf(str2));
        stringBuffer3.append("==============");
        stringBuffer3.append(" ");
        stringBuffer3.append("Connection options");
        stringBuffer3.append(" ");
        stringBuffer3.append("==============");
        stringBuffer3.append(str2);
        while (true) {
            stringBuffer2.append(stringBuffer3.toString());
            if (!propertyNames.hasMoreElements()) {
                StringBuffer stringBuffer4 = new StringBuffer("==========================================");
                stringBuffer4.append(wn.a.f30066b);
                stringBuffer2.append(stringBuffer4.toString());
                return stringBuffer2.toString();
            }
            String str3 = (String) propertyNames.nextElement();
            if (str3.length() >= 28) {
                stringBuffer = str3;
            } else {
                StringBuffer stringBuffer5 = new StringBuffer(28);
                stringBuffer5.append(str3);
                int length = 28 - str3.length();
                while (true) {
                    length--;
                    if (length < 0) {
                        break;
                    }
                    stringBuffer5.append(' ');
                }
                stringBuffer = stringBuffer5.toString();
            }
            StringBuffer stringBuffer6 = new StringBuffer(String.valueOf(stringBuffer));
            stringBuffer6.append(":  ");
            stringBuffer6.append(properties.get(str3));
            stringBuffer6.append(wn.a.f30066b);
            stringBuffer3 = stringBuffer6;
        }
    }
}
