package cn.sharesdk.framework.utils;

import android.text.TextUtils;
import android.util.Xml;
import java.util.HashMap;
import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;

/* loaded from: classes.dex */
public class n {

    /* loaded from: classes.dex */
    public static class a extends DefaultHandler {

        /* renamed from: a */
        private HashMap<String, Object> f5323a = new HashMap<>();

        /* renamed from: b */
        private HashMap<String, Object> f5324b;

        public HashMap<String, Object> a() {
            return this.f5323a;
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void characters(char[] cArr, int i10, int i11) {
            HashMap<String, Object> hashMap;
            String trim = String.valueOf(cArr, i10, i11).trim();
            if (TextUtils.isEmpty(trim) || (hashMap = this.f5324b) == null) {
                return;
            }
            hashMap.put("value", trim);
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void endElement(String str, String str2, String str3) {
            this.f5324b = null;
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void startElement(String str, String str2, String str3, Attributes attributes) {
            if (this.f5324b != null) {
                HashMap<String, Object> hashMap = new HashMap<>();
                this.f5324b.put(str2, hashMap);
                this.f5324b = hashMap;
            } else {
                HashMap<String, Object> hashMap2 = new HashMap<>();
                this.f5324b = hashMap2;
                this.f5323a.put(str2, hashMap2);
            }
            int length = attributes.getLength();
            for (int i10 = 0; i10 < length; i10++) {
                this.f5324b.put(attributes.getLocalName(i10), attributes.getValue(i10));
            }
        }
    }

    public HashMap<String, Object> a(String str) {
        a aVar = new a();
        Xml.parse(str, aVar);
        return aVar.a();
    }
}
