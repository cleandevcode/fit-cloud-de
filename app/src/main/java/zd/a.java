package zd;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothServerSocket;
import android.bluetooth.BluetoothSocket;
import android.os.Build;
import com.realsil.sdk.core.bluetooth.connection.BluetoothClient;
import ed.c;
import ed.e;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.util.Locale;
import java.util.UUID;
import no.nordicsemi.android.dfu.DfuBaseService;

/* loaded from: classes.dex */
public final class a extends BluetoothClient {

    /* renamed from: m */
    public static final UUID f32202m = UUID.fromString("00001101-0000-1000-8000-00805F9B34FB");

    /* renamed from: b */
    public boolean f32203b;

    /* renamed from: c */
    public d f32204c;

    /* renamed from: d */
    public boolean f32205d;

    /* renamed from: e */
    public final int f32206e;

    /* renamed from: f */
    public UUID f32207f;

    /* renamed from: g */
    public b f32208g;

    /* renamed from: h */
    public c f32209h;

    /* renamed from: i */
    public C0610a f32210i;

    /* renamed from: j */
    public int f32211j;

    /* renamed from: k */
    public final Object f32212k;

    /* renamed from: l */
    public Boolean f32213l;

    /* renamed from: zd.a$a */
    /* loaded from: classes.dex */
    public class C0610a extends Thread {

        /* renamed from: a */
        public final BluetoothServerSocket f32214a;

        public C0610a() {
            BluetoothServerSocket bluetoothServerSocket;
            a.this = r4;
            try {
                bluetoothServerSocket = r4.mBluetoothAdapter.listenUsingRfcommWithServiceRecord("RtkSppSecure", r4.f32207f);
            } catch (IOException e10) {
                ge.b.d("createServerSocket failed: " + e10.toString());
                bluetoothServerSocket = null;
            }
            this.f32214a = bluetoothServerSocket;
            r4.a(4);
        }

        public final void a() {
            try {
                if (this.f32214a != null) {
                    ge.b.o("cancel AcceptThread", a.this.DBG);
                    this.f32214a.close();
                }
            } catch (IOException e10) {
                ge.b.p("close() of server failed： " + e10);
            }
        }

        /* JADX WARN: Can't wrap try/catch for region: R(6:10|11|(6:13|(1:(2:16|(2:18|19)))|23|(1:25)|26|19)|27|28|19) */
        /* JADX WARN: Code restructure failed: missing block: B:70:0x0049, code lost:
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:71:0x004a, code lost:
            ge.b.p("Could not close unwanted socket： " + r0);
         */
        @Override // java.lang.Thread, java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void run() {
            /*
                r6 = this;
                zd.a r0 = zd.a.this
                boolean r0 = r0.DBG
                java.lang.String r1 = "BEGIN mAcceptThread"
                ge.b.o(r1, r0)
                java.lang.String r0 = "AcceptThread:BluetoothSpp"
                r6.setName(r0)
            Le:
                zd.a r0 = zd.a.this
                int r0 = r0.f9454a
                r1 = 2
                if (r0 == r1) goto L7b
                android.bluetooth.BluetoothServerSocket r0 = r6.f32214a     // Catch: java.io.IOException -> L63
                android.bluetooth.BluetoothSocket r0 = r0.accept()     // Catch: java.io.IOException -> L63
                if (r0 == 0) goto Le
                zd.a r2 = zd.a.this
                monitor-enter(r2)
                zd.a r3 = zd.a.this     // Catch: java.lang.Throwable -> L60
                int r4 = r3.f9454a     // Catch: java.lang.Throwable -> L60
                if (r4 == 0) goto L45
                r5 = 1
                if (r4 == r5) goto L2f
                if (r4 == r1) goto L45
                r1 = 4
                if (r4 == r1) goto L2f
                goto L5e
            L2f:
                int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L60
                r4 = 23
                if (r1 < r4) goto L3b
                int r1 = androidx.appcompat.widget.d0.a(r0)     // Catch: java.lang.Throwable -> L60
                r3.f32211j = r1     // Catch: java.lang.Throwable -> L60
            L3b:
                zd.a r1 = zd.a.this     // Catch: java.lang.Throwable -> L60
                android.bluetooth.BluetoothDevice r3 = r0.getRemoteDevice()     // Catch: java.lang.Throwable -> L60
                r1.e(r3, r0)     // Catch: java.lang.Throwable -> L60
                goto L5e
            L45:
                r0.close()     // Catch: java.io.IOException -> L49 java.lang.Throwable -> L60
                goto L5e
            L49:
                r0 = move-exception
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L60
                r1.<init>()     // Catch: java.lang.Throwable -> L60
                java.lang.String r3 = "Could not close unwanted socket： "
                r1.append(r3)     // Catch: java.lang.Throwable -> L60
                r1.append(r0)     // Catch: java.lang.Throwable -> L60
                java.lang.String r0 = r1.toString()     // Catch: java.lang.Throwable -> L60
                ge.b.p(r0)     // Catch: java.lang.Throwable -> L60
            L5e:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L60
                goto Le
            L60:
                r0 = move-exception
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L60
                throw r0
            L63:
                r0 = move-exception
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "accept() failed"
                r1.<init>(r2)
                r1.append(r0)
                java.lang.String r0 = r1.toString()
                ge.b.p(r0)
                zd.a r0 = zd.a.this
                r1 = 0
                r0.a(r1)
            L7b:
                zd.a r0 = zd.a.this
                boolean r0 = r0.DBG
                java.lang.String r1 = "END AcceptThread"
                ge.b.e(r1, r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: zd.a.C0610a.run():void");
        }
    }

    /* loaded from: classes.dex */
    public class b extends Thread {

        /* renamed from: a */
        public BluetoothSocket f32216a;

        /* renamed from: b */
        public final BluetoothDevice f32217b;

        public b(BluetoothDevice bluetoothDevice) {
            a.this = r1;
            this.f32217b = bluetoothDevice;
            this.f32216a = a(bluetoothDevice, true);
        }

        public final BluetoothSocket a(BluetoothDevice bluetoothDevice, boolean z10) {
            BluetoothSocket bluetoothSocket;
            int connectionType;
            boolean z11 = a.this.VDBG;
            ge.b.o("mSecureUuid=" + a.this.f32207f, z11);
            try {
                if (z10) {
                    bluetoothSocket = bluetoothDevice.createRfcommSocketToServiceRecord(a.this.f32207f);
                } else {
                    bluetoothSocket = bluetoothDevice.createInsecureRfcommSocketToServiceRecord(a.this.f32207f);
                }
            } catch (IOException e10) {
                ge.b.p("createBluetoothSocket failed: " + e10.toString());
                bluetoothSocket = null;
            }
            if (bluetoothSocket != null && Build.VERSION.SDK_INT >= 23) {
                a aVar = a.this;
                connectionType = bluetoothSocket.getConnectionType();
                aVar.f32211j = connectionType;
            }
            return bluetoothSocket;
        }

        public final void b() {
            try {
                BluetoothSocket bluetoothSocket = this.f32216a;
                if (bluetoothSocket != null) {
                    bluetoothSocket.close();
                }
            } catch (IOException e10) {
                ge.b.p("close socket failed: " + e10);
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            boolean z10;
            a aVar;
            setName("ConnectThread:BluetoothSpp");
            if (a.this.VDBG) {
                zd.b.a(new StringBuilder("SocketConnectionType: "), a.this.f32211j);
            }
            BluetoothAdapter bluetoothAdapter = a.this.mBluetoothAdapter;
            if (bluetoothAdapter != null) {
                bluetoothAdapter.cancelDiscovery();
            }
            BluetoothSocket bluetoothSocket = this.f32216a;
            if (bluetoothSocket == null) {
                ge.b.p("create BluetoothSocket fail");
                a.this.a(0);
                synchronized (a.this.f32212k) {
                    a.this.f32213l = Boolean.FALSE;
                }
                return;
            }
            if (bluetoothSocket.isConnected()) {
                ge.b.e("socket already connected", a.this.DBG);
            } else {
                a aVar2 = a.this;
                if (aVar2.f9454a == 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    ge.b.k("is already in connecting, ignore connect req, and wait connect result");
                    return;
                }
                aVar2.a(1);
                ge.b.o("connect socket ...", a.this.VDBG);
                try {
                    this.f32216a.connect();
                } catch (Exception e10) {
                    ge.b.p("connect socket failed, " + e10.toString());
                    try {
                        this.f32216a.close();
                    } catch (IOException e11) {
                        ge.b.p("unable to close socket during connection failure: " + e11);
                    }
                    try {
                        Thread.sleep(1000L);
                    } catch (InterruptedException e12) {
                        ge.b.o(e12.toString(), a.this.VDBG);
                    }
                    if ("Connect refused".equals(e10.getMessage())) {
                        if (this.f32217b.getBondState() == 12) {
                            this.f32216a = a(this.f32217b, false);
                        }
                        BluetoothSocket bluetoothSocket2 = this.f32216a;
                        if (bluetoothSocket2 == null) {
                            ge.b.d("create Insecure BluetoothSocket fail");
                            a.this.a(0);
                            synchronized (a.this.f32212k) {
                                a.this.f32213l = Boolean.FALSE;
                                return;
                            }
                        } else if (bluetoothSocket2.isConnected()) {
                            ge.b.d("socket already connected");
                            return;
                        } else {
                            a.this.a(1);
                            ge.b.o("refused, connect socket ...", a.this.VDBG);
                            try {
                                this.f32216a.connect();
                                return;
                            } catch (Exception e13) {
                                ge.b.d("connect socket failed, " + e13.toString());
                                try {
                                    this.f32216a.close();
                                } catch (IOException e14) {
                                    ge.b.p("unable to close socket during connection failure: " + e14);
                                }
                                try {
                                    Thread.sleep(1000L);
                                } catch (InterruptedException e15) {
                                    ge.b.o(e15.toString(), a.this.VDBG);
                                }
                                a.f(a.this);
                                return;
                            }
                        }
                    }
                    a.f(a.this);
                    return;
                }
            }
            synchronized (a.this) {
                aVar = a.this;
                aVar.f32208g = null;
            }
            aVar.e(this.f32217b, this.f32216a);
        }
    }

    /* loaded from: classes.dex */
    public class c extends Thread {

        /* renamed from: a */
        public final BluetoothSocket f32219a;

        /* renamed from: b */
        public final BufferedInputStream f32220b;

        /* renamed from: c */
        public final BufferedOutputStream f32221c;

        public c(BluetoothSocket bluetoothSocket) {
            BufferedInputStream bufferedInputStream;
            a.this = r4;
            BufferedOutputStream bufferedOutputStream = null;
            this.f32220b = null;
            this.f32221c = null;
            ge.b.d("create ConnectedThread");
            this.f32219a = bluetoothSocket;
            try {
                bufferedInputStream = new BufferedInputStream(bluetoothSocket.getInputStream());
                try {
                    bufferedOutputStream = new BufferedOutputStream(bluetoothSocket.getOutputStream());
                } catch (IOException e10) {
                    e = e10;
                    ge.b.p("temp sockets not created: " + e);
                    this.f32220b = bufferedInputStream;
                    this.f32221c = bufferedOutputStream;
                }
            } catch (IOException e11) {
                e = e11;
                bufferedInputStream = null;
            }
            this.f32220b = bufferedInputStream;
            this.f32221c = bufferedOutputStream;
        }

        public final void a() {
            BluetoothSocket bluetoothSocket = this.f32219a;
            if (bluetoothSocket == null) {
                return;
            }
            try {
                bluetoothSocket.close();
            } catch (IOException e10) {
                ge.b.p("close socket failed: " + e10);
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            e.c cVar;
            byte[] bArr = new byte[DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED];
            a.this.a(2);
            synchronized (a.this.f32212k) {
                a.this.f32213l = Boolean.FALSE;
            }
            while (!Thread.currentThread().isInterrupted() && a.this.f9454a == 2) {
                try {
                    int read = this.f32220b.read(bArr);
                    if (read > 0) {
                        byte[] bArr2 = new byte[read];
                        System.arraycopy(bArr, 0, bArr2, 0, read);
                        if (a.this.DBG) {
                            ge.b.d(String.format(Locale.US, ">> (%d) %s", Integer.valueOf(read), he.a.a(bArr2)));
                        }
                        xd.a aVar = a.this.mCallback;
                        if (aVar != null && (cVar = ed.c.this.f13570f) != null) {
                            synchronized (cVar.f28685b) {
                                cVar.f28685b.add(bArr2);
                            }
                        }
                    }
                } catch (IOException e10) {
                    ge.b.p("connectionLost: " + e10.toString());
                    a.h(a.this);
                }
            }
            if (a.this.f9454a == 3) {
                a();
                a.h(a.this);
            }
        }
    }

    public a(c.a aVar) {
        UUID uuid = f32202m;
        this.f32203b = false;
        this.f32206e = 1;
        this.f32211j = -1;
        this.f32212k = new Object();
        this.f32213l = Boolean.FALSE;
        this.f32206e = 1;
        this.f32207f = uuid;
        this.mCallback = aVar;
        d();
    }

    /* JADX WARN: Code restructure failed: missing block: B:83:0x0062, code lost:
        if (r0 == 2) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void f(zd.a r7) {
        /*
            Method dump skipped, instructions count: 196
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: zd.a.f(zd.a):void");
    }

    public static void h(a aVar) {
        ge.b.o("connectionLost", aVar.DBG);
        aVar.a(0);
        aVar.mDevice = null;
        synchronized (aVar.f32212k) {
            aVar.f32213l = Boolean.FALSE;
        }
        synchronized (aVar) {
            aVar.i();
        }
    }

    public final boolean b(d dVar) {
        synchronized (this.f32212k) {
            if (this.f32213l.booleanValue()) {
                ge.b.p("device is busy");
                return false;
            }
            this.f32213l = Boolean.TRUE;
            if (!this.f32205d) {
                d();
            }
            boolean z10 = this.DBG;
            ge.b.o("createNewConnection:" + dVar.toString(), z10);
            this.f32204c = dVar;
            BluetoothDevice bluetoothDevice = dVar.f32224a;
            this.mDevice = bluetoothDevice;
            this.f32207f = dVar.f32226c;
            BluetoothSocket bluetoothSocket = dVar.f32225b;
            if (bluetoothSocket != null) {
                e(bluetoothDevice, bluetoothSocket);
                return true;
            }
            c();
            b bVar = new b(this.mDevice);
            this.f32208g = bVar;
            bVar.start();
            return true;
        }
    }

    public final void c() {
        ge.b.o("cancelPreviousConnection", this.DBG);
        b bVar = this.f32208g;
        if (bVar != null) {
            bVar.b();
            this.f32208g.interrupt();
            this.f32208g = null;
        }
        c cVar = this.f32209h;
        if (cVar != null) {
            cVar.a();
            this.f32209h.interrupt();
            this.f32209h = null;
        }
    }

    public final void d() {
        ge.b.o("initialize...", this.DBG);
        this.DBG = rd.b.f25539b;
        this.VDBG = rd.b.f25540c;
        BluetoothAdapter a10 = sd.a.a(this.mContext);
        this.mBluetoothAdapter = a10;
        this.f9454a = 0;
        if (a10 == null) {
            ge.b.d("bluetoothAdapter not initialized ");
            this.f32205d = false;
        } else if (!a10.isEnabled()) {
            ge.b.d("bluetooth is disabled");
            this.f32205d = false;
        } else {
            this.f32205d = true;
        }
    }

    public final synchronized void e(BluetoothDevice bluetoothDevice, BluetoothSocket bluetoothSocket) {
        ge.b.e("spp connected", this.DBG);
        this.mDevice = bluetoothDevice;
        c();
        C0610a c0610a = this.f32210i;
        if (c0610a != null) {
            c0610a.a();
            this.f32210i = null;
        }
        c cVar = new c(bluetoothSocket);
        this.f32209h = cVar;
        cVar.start();
    }

    public final boolean g() {
        return this.mDevice != null && this.f9454a == 2;
    }

    public final synchronized void i() {
        ge.b.o("start secure: true", this.DBG);
        b bVar = this.f32208g;
        if (bVar != null) {
            bVar.b();
            this.f32208g.interrupt();
            this.f32208g = null;
        }
        c cVar = this.f32209h;
        if (cVar != null) {
            cVar.a();
            this.f32209h.interrupt();
            this.f32209h = null;
        }
        if ((this.f32206e & 2) == 2 && this.f32210i == null) {
            C0610a c0610a = new C0610a();
            this.f32210i = c0610a;
            c0610a.start();
        }
    }
}
