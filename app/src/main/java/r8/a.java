package r8;

import com.google.android.gms.common.api.Scope;
import com.google.android.gms.fitness.data.DataType;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a */
    public final HashSet f25448a = new HashSet();

    public final void a(DataType dataType) {
        String str = dataType.f6091c;
        String str2 = dataType.f6092d;
        if (str2 != null) {
            this.f25448a.add(new Scope(1, str2));
        }
    }
}
