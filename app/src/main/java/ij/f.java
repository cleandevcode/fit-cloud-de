package ij;

import android.net.Uri;
import java.io.File;

/* loaded from: classes2.dex */
public final class f extends gm.m implements fm.l<gj.g<File>, Uri> {

    /* renamed from: b */
    public static final f f17052b = new f();

    public f() {
        super(1);
    }

    @Override // fm.l
    public final Uri k(gj.g<File> gVar) {
        return Uri.fromFile(gVar.f15374b);
    }
}
