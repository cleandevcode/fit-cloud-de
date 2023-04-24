package g2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

@Deprecated
/* loaded from: classes.dex */
public final class a {

    /* renamed from: f */
    public static final Object f14845f = new Object();

    /* renamed from: g */
    public static a f14846g;

    /* renamed from: a */
    public final Context f14847a;

    /* renamed from: b */
    public final HashMap<BroadcastReceiver, ArrayList<c>> f14848b = new HashMap<>();

    /* renamed from: c */
    public final HashMap<String, ArrayList<c>> f14849c = new HashMap<>();

    /* renamed from: d */
    public final ArrayList<b> f14850d = new ArrayList<>();

    /* renamed from: e */
    public final HandlerC0267a f14851e;

    /* renamed from: g2.a$a */
    /* loaded from: classes.dex */
    public class HandlerC0267a extends Handler {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HandlerC0267a(Looper looper) {
            super(looper);
            a.this = r1;
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            int size;
            b[] bVarArr;
            if (message.what != 1) {
                super.handleMessage(message);
                return;
            }
            a aVar = a.this;
            while (true) {
                synchronized (aVar.f14848b) {
                    size = aVar.f14850d.size();
                    if (size <= 0) {
                        return;
                    }
                    bVarArr = new b[size];
                    aVar.f14850d.toArray(bVarArr);
                    aVar.f14850d.clear();
                }
                for (int i10 = 0; i10 < size; i10++) {
                    b bVar = bVarArr[i10];
                    int size2 = bVar.f14854b.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        c cVar = bVar.f14854b.get(i11);
                        if (!cVar.f14858d) {
                            cVar.f14856b.onReceive(aVar.f14847a, bVar.f14853a);
                        }
                    }
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        public final Intent f14853a;

        /* renamed from: b */
        public final ArrayList<c> f14854b;

        public b(Intent intent, ArrayList<c> arrayList) {
            this.f14853a = intent;
            this.f14854b = arrayList;
        }
    }

    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a */
        public final IntentFilter f14855a;

        /* renamed from: b */
        public final BroadcastReceiver f14856b;

        /* renamed from: c */
        public boolean f14857c;

        /* renamed from: d */
        public boolean f14858d;

        public c(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
            this.f14855a = intentFilter;
            this.f14856b = broadcastReceiver;
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder(128);
            sb2.append("Receiver{");
            sb2.append(this.f14856b);
            sb2.append(" filter=");
            sb2.append(this.f14855a);
            if (this.f14858d) {
                sb2.append(" DEAD");
            }
            sb2.append("}");
            return sb2.toString();
        }
    }

    public a(Context context) {
        this.f14847a = context;
        this.f14851e = new HandlerC0267a(context.getMainLooper());
    }

    public static a a(Context context) {
        a aVar;
        synchronized (f14845f) {
            if (f14846g == null) {
                f14846g = new a(context.getApplicationContext());
            }
            aVar = f14846g;
        }
        return aVar;
    }

    public final void b(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        synchronized (this.f14848b) {
            c cVar = new c(broadcastReceiver, intentFilter);
            ArrayList<c> arrayList = this.f14848b.get(broadcastReceiver);
            if (arrayList == null) {
                arrayList = new ArrayList<>(1);
                this.f14848b.put(broadcastReceiver, arrayList);
            }
            arrayList.add(cVar);
            for (int i10 = 0; i10 < intentFilter.countActions(); i10++) {
                String action = intentFilter.getAction(i10);
                ArrayList<c> arrayList2 = this.f14849c.get(action);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList<>(1);
                    this.f14849c.put(action, arrayList2);
                }
                arrayList2.add(cVar);
            }
        }
    }

    public final void c(Intent intent) {
        int i10;
        String str;
        ArrayList arrayList;
        ArrayList<c> arrayList2;
        String str2;
        synchronized (this.f14848b) {
            String action = intent.getAction();
            String resolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.f14847a.getContentResolver());
            Uri data = intent.getData();
            String scheme = intent.getScheme();
            Set<String> categories = intent.getCategories();
            boolean z10 = (intent.getFlags() & 8) != 0;
            if (z10) {
                Log.v("LocalBroadcastManager", "Resolving type " + resolveTypeIfNeeded + " scheme " + scheme + " of intent " + intent);
            }
            ArrayList<c> arrayList3 = this.f14849c.get(intent.getAction());
            if (arrayList3 != null) {
                if (z10) {
                    Log.v("LocalBroadcastManager", "Action list: " + arrayList3);
                }
                ArrayList arrayList4 = null;
                int i11 = 0;
                while (i11 < arrayList3.size()) {
                    c cVar = arrayList3.get(i11);
                    if (z10) {
                        Log.v("LocalBroadcastManager", "Matching against filter " + cVar.f14855a);
                    }
                    if (cVar.f14857c) {
                        if (z10) {
                            Log.v("LocalBroadcastManager", "  Filter's target already added");
                        }
                        i10 = i11;
                        arrayList2 = arrayList3;
                        str = action;
                        str2 = resolveTypeIfNeeded;
                        arrayList = arrayList4;
                    } else {
                        i10 = i11;
                        str = action;
                        arrayList = arrayList4;
                        arrayList2 = arrayList3;
                        str2 = resolveTypeIfNeeded;
                        int match = cVar.f14855a.match(action, resolveTypeIfNeeded, scheme, data, categories, "LocalBroadcastManager");
                        if (match >= 0) {
                            if (z10) {
                                Log.v("LocalBroadcastManager", "  Filter matched!  match=0x" + Integer.toHexString(match));
                            }
                            arrayList4 = arrayList == null ? new ArrayList() : arrayList;
                            arrayList4.add(cVar);
                            cVar.f14857c = true;
                            i11 = i10 + 1;
                            action = str;
                            arrayList3 = arrayList2;
                            resolveTypeIfNeeded = str2;
                        } else if (z10) {
                            Log.v("LocalBroadcastManager", "  Filter did not match: " + (match != -4 ? match != -3 ? match != -2 ? match != -1 ? "unknown reason" : "type" : "data" : "action" : "category"));
                        }
                    }
                    arrayList4 = arrayList;
                    i11 = i10 + 1;
                    action = str;
                    arrayList3 = arrayList2;
                    resolveTypeIfNeeded = str2;
                }
                ArrayList arrayList5 = arrayList4;
                if (arrayList5 != null) {
                    for (int i12 = 0; i12 < arrayList5.size(); i12++) {
                        ((c) arrayList5.get(i12)).f14857c = false;
                    }
                    this.f14850d.add(new b(intent, arrayList5));
                    if (!this.f14851e.hasMessages(1)) {
                        this.f14851e.sendEmptyMessage(1);
                    }
                }
            }
        }
    }

    public final void d(BroadcastReceiver broadcastReceiver) {
        synchronized (this.f14848b) {
            ArrayList<c> remove = this.f14848b.remove(broadcastReceiver);
            if (remove == null) {
                return;
            }
            for (int size = remove.size() - 1; size >= 0; size--) {
                c cVar = remove.get(size);
                cVar.f14858d = true;
                for (int i10 = 0; i10 < cVar.f14855a.countActions(); i10++) {
                    String action = cVar.f14855a.getAction(i10);
                    ArrayList<c> arrayList = this.f14849c.get(action);
                    if (arrayList != null) {
                        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                            c cVar2 = arrayList.get(size2);
                            if (cVar2.f14856b == broadcastReceiver) {
                                cVar2.f14858d = true;
                                arrayList.remove(size2);
                            }
                        }
                        if (arrayList.size() <= 0) {
                            this.f14849c.remove(action);
                        }
                    }
                }
            }
        }
    }
}
