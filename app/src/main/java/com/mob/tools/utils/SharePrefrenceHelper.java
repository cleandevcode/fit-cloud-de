package com.mob.tools.utils;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.Base64;
import com.mob.commons.C0744r;
import com.mob.commons.j;
import com.mob.commons.u;
import com.mob.tools.MobHandlerThread;
import com.mob.tools.MobLog;
import com.mob.tools.proguard.PublicMemberKeeper;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStreamWriter;
import java.util.HashMap;

/* loaded from: classes.dex */
public class SharePrefrenceHelper implements PublicMemberKeeper {

    /* renamed from: a */
    private Context f9356a;

    /* renamed from: b */
    private volatile a f9357b;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: c */
        private static Handler f9358c;

        /* renamed from: a */
        private File f9359a;

        /* renamed from: b */
        private HashMap<String, Object> f9360b = new HashMap<>();

        static {
            String str;
            if (TextUtils.isEmpty("M-")) {
                str = null;
            } else {
                str = u.f8514a + j.a("0026cfef");
            }
            f9358c = MobHandlerThread.newHandler(str, new Handler.Callback() { // from class: com.mob.tools.utils.SharePrefrenceHelper.a.1
                @Override // android.os.Handler.Callback
                public boolean handleMessage(Message message) {
                    try {
                        Bundle data = message.getData();
                        String string = data.getString(j.a("0045fddecabi"));
                        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(data.getString(j.a("004?dfbccbAg"))), "utf-8");
                        outputStreamWriter.append((CharSequence) string);
                        outputStreamWriter.flush();
                        outputStreamWriter.close();
                        return false;
                    } catch (Throwable th2) {
                        MobLog.getInstance().w(th2);
                        return false;
                    }
                }
            });
        }

        public a(Context context, String str) {
            if (context != null) {
                try {
                    File file = new File(new File(context.getFilesDir(), j.a("003=egcada")), str);
                    this.f9359a = file;
                    if (!file.getParentFile().exists()) {
                        this.f9359a.getParentFile().mkdirs();
                    }
                    if (!this.f9359a.exists()) {
                        this.f9359a.createNewFile();
                    }
                } catch (Throwable th2) {
                    MobLog.getInstance().d(th2);
                    return;
                }
            }
            c();
        }

        public void a(String str, Object obj) {
            synchronized (this.f9360b) {
                this.f9360b.put(str, obj);
                if (f9358c != null && this.f9359a != null) {
                    Message message = new Message();
                    Bundle bundle = new Bundle();
                    bundle.putString(j.a("004Ofddecabi"), HashonHelper.fromHashMap(this.f9360b));
                    bundle.putString(j.a("004AdfbccbUg"), this.f9359a.getAbsolutePath());
                    message.setData(bundle);
                    message.what = 1;
                    f9358c.sendMessage(message);
                }
            }
        }

        public Object b(String str) {
            Object obj;
            synchronized (this.f9360b) {
                obj = this.f9360b.get(str);
            }
            return obj;
        }

        private void c() {
            BufferedReader bufferedReader;
            Throwable th2;
            synchronized (this.f9360b) {
                File file = this.f9359a;
                if (file != null && file.exists()) {
                    try {
                        bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(this.f9359a), "utf-8"));
                        try {
                            StringBuilder sb2 = new StringBuilder();
                            while (true) {
                                String readLine = bufferedReader.readLine();
                                if (readLine == null) {
                                    break;
                                }
                                if (sb2.length() > 0) {
                                    sb2.append("\n");
                                }
                                sb2.append(readLine);
                            }
                            this.f9360b = HashonHelper.fromJson(sb2.toString());
                            C0744r.a(bufferedReader);
                        } catch (Throwable th3) {
                            th2 = th3;
                            MobLog.getInstance().w(th2);
                            C0744r.a(bufferedReader);
                        }
                    } catch (Throwable th4) {
                        bufferedReader = null;
                        th2 = th4;
                    }
                }
            }
        }

        public int a(String str, int i10) {
            Object b10 = b(str);
            return b10 != null ? ((Number) b10).intValue() : i10;
        }

        public long a(String str, long j10) {
            Object b10 = b(str);
            return b10 != null ? ((Number) b10).longValue() : j10;
        }

        public String a(String str, String str2) {
            Object b10 = b(str);
            return b10 != null ? (String) b10 : str2;
        }

        public HashMap<String, Object> a() {
            HashMap<String, Object> hashMap;
            synchronized (this.f9360b) {
                hashMap = new HashMap<>();
                hashMap.putAll(this.f9360b);
            }
            return hashMap;
        }

        public void a(String str) {
            a(str, (Object) null);
        }

        public void a(String str, byte b10) {
            a(str, Byte.valueOf(b10));
        }

        public void a(HashMap<String, Object> hashMap) {
            synchronized (this.f9360b) {
                this.f9360b.putAll(hashMap);
            }
            if (f9358c == null || this.f9359a == null) {
                return;
            }
            Message message = new Message();
            Bundle bundle = new Bundle();
            bundle.putString(j.a("004!fddecabi"), HashonHelper.fromHashMap(this.f9360b));
            bundle.putString(j.a("004>dfbccb-g"), this.f9359a.getAbsolutePath());
            message.setData(bundle);
            message.what = 1;
            f9358c.sendMessage(message);
        }

        public boolean a(String str, boolean z10) {
            Object b10 = b(str);
            return b10 != null ? ((Number) b10).byteValue() == 1 : z10;
        }

        public void b() {
            synchronized (this.f9360b) {
                this.f9360b.clear();
            }
            if (f9358c == null || this.f9359a == null) {
                return;
            }
            Message message = new Message();
            Bundle bundle = new Bundle();
            bundle.putString(j.a("004'fddecabi"), HashonHelper.fromHashMap(this.f9360b));
            bundle.putString(j.a("004QdfbccbWg"), this.f9359a.getAbsolutePath());
            message.setData(bundle);
            message.what = 1;
            f9358c.sendMessage(message);
        }

        public void b(String str, int i10) {
            a(str, Integer.valueOf(i10));
        }

        public void b(String str, long j10) {
            a(str, Long.valueOf(j10));
        }

        public void b(String str, String str2) {
            a(str, (Object) str2);
        }

        public void b(String str, boolean z10) {
            a(str, z10 ? (byte) 1 : (byte) 0);
        }
    }

    public SharePrefrenceHelper(Context context) {
        if (context != null) {
            this.f9356a = context.getApplicationContext();
        }
    }

    public void clear() {
        if (this.f9357b != null) {
            this.f9357b.b();
        }
    }

    public Object get(String str) {
        ObjectInputStream objectInputStream;
        try {
            String string = getString(str);
            if (TextUtils.isEmpty(string)) {
                return null;
            }
            try {
                objectInputStream = new ObjectInputStream(new ByteArrayInputStream(Base64.decode(string, 2)));
            } catch (Throwable th2) {
                th = th2;
                objectInputStream = null;
            }
            try {
                Object readObject = objectInputStream.readObject();
                objectInputStream.close();
                C0744r.a(objectInputStream);
                return readObject;
            } catch (Throwable th3) {
                th = th3;
                C0744r.a(objectInputStream);
                throw th;
            }
        } catch (Throwable th4) {
            MobLog.getInstance().w(th4);
            return null;
        }
    }

    public HashMap<String, Object> getAll() {
        return this.f9357b != null ? this.f9357b.a() : new HashMap<>();
    }

    public boolean getBoolean(String str) {
        if (this.f9357b != null) {
            return this.f9357b.a(str, false);
        }
        return false;
    }

    public boolean getBoolean(String str, boolean z10) {
        return this.f9357b != null ? this.f9357b.a(str, z10) : z10;
    }

    public int getInt(String str) {
        if (this.f9357b != null) {
            return this.f9357b.a(str, 0);
        }
        return 0;
    }

    public int getInt(String str, int i10) {
        return this.f9357b != null ? this.f9357b.a(str, i10) : i10;
    }

    public long getLong(String str) {
        return getLong(str, 0L);
    }

    public long getLong(String str, long j10) {
        return this.f9357b != null ? this.f9357b.a(str, j10) : j10;
    }

    public Object getObj(String str, Object obj) {
        return this.f9357b != null ? this.f9357b.b(str) : obj;
    }

    public String getString(String str) {
        return this.f9357b != null ? this.f9357b.a(str, "") : "";
    }

    public String getString(String str, String str2) {
        return this.f9357b != null ? this.f9357b.a(str, str2) : str2;
    }

    public void open(String str) {
        open(str, 0);
    }

    public void open(String str, int i10) {
        this.f9357b = new a(this.f9356a, str + "_" + i10);
    }

    public void put(String str, Object obj) {
        ByteArrayOutputStream byteArrayOutputStream;
        ObjectOutputStream objectOutputStream;
        if (obj == null) {
            return;
        }
        ObjectOutputStream objectOutputStream2 = null;
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            objectOutputStream.writeObject(obj);
            objectOutputStream.flush();
            putString(str, Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2));
            C0744r.a(objectOutputStream);
        } catch (Throwable th3) {
            th = th3;
            objectOutputStream2 = objectOutputStream;
            try {
                MobLog.getInstance().w(th);
                C0744r.a(objectOutputStream2);
            } catch (Throwable th4) {
                C0744r.a(objectOutputStream2);
                throw th4;
            }
        }
    }

    public void putAll(HashMap<String, Object> hashMap) {
        if (this.f9357b != null) {
            this.f9357b.a(hashMap);
        }
    }

    public void putBoolean(String str, Boolean bool) {
        if (this.f9357b != null) {
            this.f9357b.b(str, bool.booleanValue());
        }
    }

    public void putInt(String str, Integer num) {
        if (this.f9357b != null) {
            this.f9357b.b(str, num.intValue());
        }
    }

    public void putLong(String str, Long l10) {
        if (this.f9357b != null) {
            this.f9357b.b(str, l10.longValue());
        }
    }

    public void putObj(String str, Object obj) {
        if (obj == null && this.f9357b != null) {
            this.f9357b.a(str);
        } else if (this.f9357b != null) {
            this.f9357b.a(str, obj);
        }
    }

    public void putString(String str, String str2) {
        if (this.f9357b != null) {
            this.f9357b.b(str, str2);
        }
    }

    public void remove(String str) {
        if (this.f9357b != null) {
            this.f9357b.a(str);
        }
    }
}
