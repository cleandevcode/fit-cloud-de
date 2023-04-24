package ta;

import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Objects;

/* loaded from: classes.dex */
public final class g extends ya.b {

    /* renamed from: o */
    public static final a f27863o = new a();

    /* renamed from: p */
    public static final qa.q f27864p = new qa.q("closed");

    /* renamed from: l */
    public final ArrayList f27865l;

    /* renamed from: m */
    public String f27866m;

    /* renamed from: n */
    public qa.l f27867n;

    /* loaded from: classes.dex */
    public class a extends Writer {
        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            throw new AssertionError();
        }

        @Override // java.io.Writer, java.io.Flushable
        public final void flush() {
            throw new AssertionError();
        }

        @Override // java.io.Writer
        public final void write(char[] cArr, int i10, int i11) {
            throw new AssertionError();
        }
    }

    public g() {
        super(f27863o);
        this.f27865l = new ArrayList();
        this.f27867n = qa.n.f24663a;
    }

    @Override // ya.b
    public final void E(double d10) {
        if (!this.f31269e && (Double.isNaN(d10) || Double.isInfinite(d10))) {
            throw new IllegalArgumentException("JSON forbids NaN and infinities: " + d10);
        }
        X(new qa.q(Double.valueOf(d10)));
    }

    @Override // ya.b
    public final void F(long j10) {
        X(new qa.q(Long.valueOf(j10)));
    }

    @Override // ya.b
    public final void I(Boolean bool) {
        if (bool == null) {
            X(qa.n.f24663a);
        } else {
            X(new qa.q(bool));
        }
    }

    @Override // ya.b
    public final void J(Number number) {
        if (number == null) {
            X(qa.n.f24663a);
            return;
        }
        if (!this.f31269e) {
            double doubleValue = number.doubleValue();
            if (Double.isNaN(doubleValue) || Double.isInfinite(doubleValue)) {
                throw new IllegalArgumentException("JSON forbids NaN and infinities: " + number);
            }
        }
        X(new qa.q(number));
    }

    @Override // ya.b
    public final void L(String str) {
        if (str == null) {
            X(qa.n.f24663a);
        } else {
            X(new qa.q(str));
        }
    }

    @Override // ya.b
    public final void P(boolean z10) {
        X(new qa.q(Boolean.valueOf(z10)));
    }

    public final qa.l W() {
        ArrayList arrayList = this.f27865l;
        return (qa.l) arrayList.get(arrayList.size() - 1);
    }

    public final void X(qa.l lVar) {
        if (this.f27866m != null) {
            lVar.getClass();
            if (!(lVar instanceof qa.n) || this.f31272h) {
                ((qa.o) W()).f24664a.put(this.f27866m, lVar);
            }
            this.f27866m = null;
        } else if (this.f27865l.isEmpty()) {
            this.f27867n = lVar;
        } else {
            qa.l W = W();
            if (W instanceof qa.j) {
                qa.j jVar = (qa.j) W;
                if (lVar == null) {
                    jVar.getClass();
                    lVar = qa.n.f24663a;
                }
                jVar.f24662a.add(lVar);
                return;
            }
            throw new IllegalStateException();
        }
    }

    @Override // ya.b
    public final void b() {
        qa.j jVar = new qa.j();
        X(jVar);
        this.f27865l.add(jVar);
    }

    @Override // ya.b, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (!this.f27865l.isEmpty()) {
            throw new IOException("Incomplete document");
        }
        this.f27865l.add(f27864p);
    }

    @Override // ya.b, java.io.Flushable
    public final void flush() {
    }

    @Override // ya.b
    public final void h() {
        qa.o oVar = new qa.o();
        X(oVar);
        this.f27865l.add(oVar);
    }

    @Override // ya.b
    public final void k() {
        if (this.f27865l.isEmpty() || this.f27866m != null) {
            throw new IllegalStateException();
        }
        if (!(W() instanceof qa.j)) {
            throw new IllegalStateException();
        }
        ArrayList arrayList = this.f27865l;
        arrayList.remove(arrayList.size() - 1);
    }

    @Override // ya.b
    public final void q() {
        if (this.f27865l.isEmpty() || this.f27866m != null) {
            throw new IllegalStateException();
        }
        if (!(W() instanceof qa.o)) {
            throw new IllegalStateException();
        }
        ArrayList arrayList = this.f27865l;
        arrayList.remove(arrayList.size() - 1);
    }

    @Override // ya.b
    public final void s(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.f27865l.isEmpty() || this.f27866m != null) {
            throw new IllegalStateException();
        }
        if (!(W() instanceof qa.o)) {
            throw new IllegalStateException();
        }
        this.f27866m = str;
    }

    @Override // ya.b
    public final ya.b y() {
        X(qa.n.f24663a);
        return this;
    }
}
