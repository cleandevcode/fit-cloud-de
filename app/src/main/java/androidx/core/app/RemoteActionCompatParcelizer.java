package androidx.core.app;

import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;
import z2.b;
import z2.d;

/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(b bVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        d dVar = remoteActionCompat.f2178a;
        if (bVar.h(1)) {
            dVar = bVar.n();
        }
        remoteActionCompat.f2178a = (IconCompat) dVar;
        CharSequence charSequence = remoteActionCompat.f2179b;
        if (bVar.h(2)) {
            charSequence = bVar.g();
        }
        remoteActionCompat.f2179b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.f2180c;
        if (bVar.h(3)) {
            charSequence2 = bVar.g();
        }
        remoteActionCompat.f2180c = charSequence2;
        remoteActionCompat.f2181d = (PendingIntent) bVar.l(remoteActionCompat.f2181d, 4);
        boolean z10 = remoteActionCompat.f2182e;
        if (bVar.h(5)) {
            z10 = bVar.e();
        }
        remoteActionCompat.f2182e = z10;
        boolean z11 = remoteActionCompat.f2183f;
        if (bVar.h(6)) {
            z11 = bVar.e();
        }
        remoteActionCompat.f2183f = z11;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, b bVar) {
        bVar.getClass();
        IconCompat iconCompat = remoteActionCompat.f2178a;
        bVar.o(1);
        bVar.w(iconCompat);
        CharSequence charSequence = remoteActionCompat.f2179b;
        bVar.o(2);
        bVar.r(charSequence);
        CharSequence charSequence2 = remoteActionCompat.f2180c;
        bVar.o(3);
        bVar.r(charSequence2);
        PendingIntent pendingIntent = remoteActionCompat.f2181d;
        bVar.o(4);
        bVar.u(pendingIntent);
        boolean z10 = remoteActionCompat.f2182e;
        bVar.o(5);
        bVar.p(z10);
        boolean z11 = remoteActionCompat.f2183f;
        bVar.o(6);
        bVar.p(z11);
    }
}
