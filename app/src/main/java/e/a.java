package e;

import android.content.Intent;
import androidx.activity.ComponentActivity;
import gm.l;
import java.io.Serializable;

/* loaded from: classes.dex */
public abstract class a<I, O> {

    /* renamed from: e.a$a */
    /* loaded from: classes.dex */
    public static final class C0233a<T> {

        /* renamed from: a */
        public final T f13281a;

        /* JADX WARN: Multi-variable type inference failed */
        public C0233a(Serializable serializable) {
            this.f13281a = serializable;
        }
    }

    public abstract Intent a(ComponentActivity componentActivity, Object obj);

    public C0233a b(ComponentActivity componentActivity, Object obj) {
        l.f(componentActivity, "context");
        return null;
    }

    public abstract Object c(Intent intent, int i10);
}
