package dm;

import gm.k;
import gm.l;
import java.io.File;
import java.util.ArrayDeque;
import java.util.Iterator;
import nm.g;
import qa.p;
import s.c0;

/* loaded from: classes2.dex */
public final class a implements g<File> {

    /* renamed from: a */
    public final File f13166a;

    /* renamed from: b */
    public final int f13167b;

    /* renamed from: c */
    public final int f13168c;

    /* renamed from: dm.a$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC0229a extends c {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AbstractC0229a(File file) {
            super(file);
            l.f(file, "rootDir");
        }
    }

    /* loaded from: classes2.dex */
    public final class b extends ul.b<File> {

        /* renamed from: c */
        public final ArrayDeque<c> f13169c;

        /* renamed from: dm.a$b$a */
        /* loaded from: classes2.dex */
        public final class C0230a extends AbstractC0229a {

            /* renamed from: b */
            public boolean f13171b;

            /* renamed from: c */
            public File[] f13172c;

            /* renamed from: d */
            public int f13173d;

            /* renamed from: e */
            public boolean f13174e;

            /* renamed from: f */
            public final /* synthetic */ b f13175f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0230a(b bVar, File file) {
                super(file);
                l.f(file, "rootDir");
                this.f13175f = bVar;
            }

            @Override // dm.a.c
            public final File a() {
                if (!this.f13174e && this.f13172c == null) {
                    a.this.getClass();
                    File[] listFiles = this.f13181a.listFiles();
                    this.f13172c = listFiles;
                    if (listFiles == null) {
                        a.this.getClass();
                        this.f13174e = true;
                    }
                }
                File[] fileArr = this.f13172c;
                if (fileArr != null) {
                    int i10 = this.f13173d;
                    l.c(fileArr);
                    if (i10 < fileArr.length) {
                        File[] fileArr2 = this.f13172c;
                        l.c(fileArr2);
                        int i11 = this.f13173d;
                        this.f13173d = i11 + 1;
                        return fileArr2[i11];
                    }
                }
                if (!this.f13171b) {
                    this.f13171b = true;
                    return this.f13181a;
                }
                a.this.getClass();
                return null;
            }
        }

        /* renamed from: dm.a$b$b */
        /* loaded from: classes2.dex */
        public final class C0231b extends c {

            /* renamed from: b */
            public boolean f13176b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0231b(File file) {
                super(file);
                l.f(file, "rootFile");
            }

            @Override // dm.a.c
            public final File a() {
                if (this.f13176b) {
                    return null;
                }
                this.f13176b = true;
                return this.f13181a;
            }
        }

        /* loaded from: classes2.dex */
        public final class c extends AbstractC0229a {

            /* renamed from: b */
            public boolean f13177b;

            /* renamed from: c */
            public File[] f13178c;

            /* renamed from: d */
            public int f13179d;

            /* renamed from: e */
            public final /* synthetic */ b f13180e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(b bVar, File file) {
                super(file);
                l.f(file, "rootDir");
                this.f13180e = bVar;
            }

            /* JADX WARN: Code restructure failed: missing block: B:47:0x0044, code lost:
                if (r0.length == 0) goto L21;
             */
            @Override // dm.a.c
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.io.File a() {
                /*
                    r3 = this;
                    boolean r0 = r3.f13177b
                    if (r0 != 0) goto L11
                    dm.a$b r0 = r3.f13180e
                    dm.a r0 = dm.a.this
                    r0.getClass()
                    r0 = 1
                    r3.f13177b = r0
                    java.io.File r0 = r3.f13181a
                    return r0
                L11:
                    java.io.File[] r0 = r3.f13178c
                    r1 = 0
                    if (r0 == 0) goto L27
                    int r2 = r3.f13179d
                    gm.l.c(r0)
                    int r0 = r0.length
                    if (r2 >= r0) goto L1f
                    goto L27
                L1f:
                    dm.a$b r0 = r3.f13180e
                    dm.a r0 = dm.a.this
                    r0.getClass()
                    return r1
                L27:
                    java.io.File[] r0 = r3.f13178c
                    if (r0 != 0) goto L4e
                    java.io.File r0 = r3.f13181a
                    java.io.File[] r0 = r0.listFiles()
                    r3.f13178c = r0
                    if (r0 != 0) goto L3c
                    dm.a$b r0 = r3.f13180e
                    dm.a r0 = dm.a.this
                    r0.getClass()
                L3c:
                    java.io.File[] r0 = r3.f13178c
                    if (r0 == 0) goto L46
                    gm.l.c(r0)
                    int r0 = r0.length
                    if (r0 != 0) goto L4e
                L46:
                    dm.a$b r0 = r3.f13180e
                    dm.a r0 = dm.a.this
                    r0.getClass()
                    return r1
                L4e:
                    java.io.File[] r0 = r3.f13178c
                    gm.l.c(r0)
                    int r1 = r3.f13179d
                    int r2 = r1 + 1
                    r3.f13179d = r2
                    r0 = r0[r1]
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: dm.a.b.c.a():java.io.File");
            }
        }

        public b() {
            a.this = r3;
            ArrayDeque<c> arrayDeque = new ArrayDeque<>();
            this.f13169c = arrayDeque;
            if (r3.f13166a.isDirectory()) {
                arrayDeque.push(c(r3.f13166a));
            } else if (r3.f13166a.isFile()) {
                arrayDeque.push(new C0231b(r3.f13166a));
            } else {
                this.f28851a = 3;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // ul.b
        public final void a() {
            T t10;
            File a10;
            while (true) {
                c peek = this.f13169c.peek();
                if (peek == null) {
                    t10 = 0;
                    break;
                }
                a10 = peek.a();
                if (a10 == null) {
                    this.f13169c.pop();
                } else if (l.a(a10, peek.f13181a) || !a10.isDirectory() || this.f13169c.size() >= a.this.f13168c) {
                    break;
                } else {
                    this.f13169c.push(c(a10));
                }
            }
            t10 = a10;
            if (t10 != 0) {
                this.f28852b = t10;
                this.f28851a = 1;
                return;
            }
            this.f28851a = 3;
        }

        public final AbstractC0229a c(File file) {
            int b10 = c0.b(a.this.f13167b);
            if (b10 != 0) {
                if (b10 == 1) {
                    return new C0230a(this, file);
                }
                throw new p();
            }
            return new c(this, file);
        }
    }

    /* loaded from: classes2.dex */
    public static abstract class c {

        /* renamed from: a */
        public final File f13181a;

        public c(File file) {
            l.f(file, "root");
            this.f13181a = file;
        }

        public abstract File a();
    }

    public a(File file) {
        k.b(2, "direction");
        this.f13166a = file;
        this.f13167b = 2;
        this.f13168c = Integer.MAX_VALUE;
    }

    @Override // nm.g
    public final Iterator<File> iterator() {
        return new b();
    }
}
