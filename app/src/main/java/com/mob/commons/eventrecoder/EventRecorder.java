package com.mob.commons.eventrecoder;

import android.text.TextUtils;
import com.mob.MobSDK;
import com.mob.commons.k;
import com.mob.commons.l;
import com.mob.tools.MobLog;
import com.mob.tools.proguard.PublicMemberKeeper;
import com.mob.tools.utils.FileLocker;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.util.LinkedList;

/* loaded from: classes.dex */
public final class EventRecorder implements PublicMemberKeeper {

    /* renamed from: a */
    private static File f8396a;

    /* renamed from: b */
    private static FileOutputStream f8397b;

    private static final void a(k kVar) {
        l.a(new File(MobSDK.getContext().getFilesDir(), l.f8433a), kVar);
    }

    private static final void a(final String str) {
        a(new k() { // from class: com.mob.commons.eventrecoder.EventRecorder.2
            @Override // com.mob.commons.k
            public boolean a(FileLocker fileLocker) {
                try {
                    EventRecorder.f8397b.write(str.getBytes("utf-8"));
                    EventRecorder.f8397b.flush();
                    return false;
                } catch (Throwable th2) {
                    MobLog.getInstance().w(th2);
                    return false;
                }
            }
        });
    }

    public static final synchronized void addBegin(String str, String str2) {
        synchronized (EventRecorder.class) {
            a(str + " " + str2 + " 0\n");
        }
    }

    public static final synchronized void addEnd(String str, String str2) {
        synchronized (EventRecorder.class) {
            a(str + " " + str2 + " 1\n");
        }
    }

    public static final synchronized String checkRecord(final String str) {
        synchronized (EventRecorder.class) {
            final LinkedList linkedList = new LinkedList();
            a(new k() { // from class: com.mob.commons.eventrecoder.EventRecorder.3
                @Override // com.mob.commons.k
                public boolean a(FileLocker fileLocker) {
                    int indexOf;
                    try {
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(EventRecorder.f8396a), "utf-8"));
                        while (true) {
                            String readLine = bufferedReader.readLine();
                            if (TextUtils.isEmpty(readLine)) {
                                break;
                            }
                            String[] split = readLine.split(" ");
                            if (str.equals(split[0])) {
                                if ("0".equals(split[2])) {
                                    linkedList.add(split[1]);
                                } else if ("1".equals(split[2]) && (indexOf = linkedList.indexOf(split[1])) != -1) {
                                    linkedList.remove(indexOf);
                                }
                            }
                        }
                        bufferedReader.close();
                    } catch (Throwable th2) {
                        MobLog.getInstance().d(th2);
                    }
                    return false;
                }
            });
            if (linkedList.size() > 0) {
                return (String) linkedList.get(0);
            }
            return null;
        }
    }

    public static final synchronized void clear() {
        synchronized (EventRecorder.class) {
            a(new k() { // from class: com.mob.commons.eventrecoder.EventRecorder.4
                @Override // com.mob.commons.k
                public boolean a(FileLocker fileLocker) {
                    try {
                        EventRecorder.f8397b.close();
                        EventRecorder.f8396a.delete();
                        File unused = EventRecorder.f8396a = new File(MobSDK.getContext().getFilesDir(), ".mrecord");
                        EventRecorder.f8396a.createNewFile();
                        FileOutputStream unused2 = EventRecorder.f8397b = new FileOutputStream(EventRecorder.f8396a, true);
                        return false;
                    } catch (Throwable th2) {
                        MobLog.getInstance().w(th2);
                        return false;
                    }
                }
            });
        }
    }

    public static final synchronized void prepare() {
        synchronized (EventRecorder.class) {
            a(new k() { // from class: com.mob.commons.eventrecoder.EventRecorder.1
                @Override // com.mob.commons.k
                public boolean a(FileLocker fileLocker) {
                    try {
                        File unused = EventRecorder.f8396a = new File(MobSDK.getContext().getFilesDir(), ".mrecord");
                        if (!EventRecorder.f8396a.exists()) {
                            EventRecorder.f8396a.createNewFile();
                        }
                        FileOutputStream unused2 = EventRecorder.f8397b = new FileOutputStream(EventRecorder.f8396a, true);
                        return false;
                    } catch (Throwable th2) {
                        MobLog.getInstance().w(th2);
                        return false;
                    }
                }
            });
        }
    }
}
