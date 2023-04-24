package y;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.net.Uri;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import com.topstep.fitcloud.pro.ui.device.dial.DfuViewModel;
import com.topstep.fitcloudpro.R;
import java.io.File;
import java.util.ArrayList;
import p0.c;
import si.a;
import si.f;
import x5.h;
import y5.d;

/* loaded from: classes.dex */
public final /* synthetic */ class i0 implements c.InterfaceC0425c, h.a, Toolbar.f, f.a {

    /* renamed from: a */
    public final /* synthetic */ int f30719a;

    /* renamed from: b */
    public final /* synthetic */ Object f30720b;

    /* renamed from: c */
    public final /* synthetic */ Object f30721c;

    public /* synthetic */ i0(Object obj, Object obj2, int i10) {
        this.f30719a = i10;
        this.f30720b = obj;
        this.f30721c = obj2;
    }

    public final void a(m2.l lVar, ArrayList arrayList) {
        ArrayList arrayList2 = (ArrayList) this.f30720b;
        gm.l.f(arrayList2, "$descriptors");
        gm.l.f(lVar, "scope");
        int i10 = si.a.D0;
        ((jc.x) lVar.f20215a).f((jc.c) lVar.f20216b, false, a.C0483a.a(1, arrayList, arrayList2, (String) this.f30721c));
    }

    @Override // si.f.a
    public final void b(boolean z10) {
        byte b10;
        zh.a aVar = (zh.a) this.f30720b;
        y3.b bVar = (y3.b) this.f30721c;
        gm.l.f(aVar, "this$0");
        gm.l.f(bVar, "$dialFileState");
        if (z10) {
            wh.e eVar = aVar.I0;
            if (eVar != null) {
                b10 = eVar.f29842d.get(eVar.f29845g).getBinFlag();
            } else {
                b10 = 0;
            }
            Uri fromFile = Uri.fromFile((File) ((y3.c1) bVar).f30937b);
            gm.l.e(fromFile, "fromFile(dialFileState())");
            ((DfuViewModel) aVar.K0.getValue()).g(3, fromFile, b10);
        }
    }

    @Override // x5.h.a
    public final void c(File file) {
        d.b bVar = (d.b) this.f30720b;
        gm.l.f(bVar, "$slave");
        gm.l.f(file, "file");
        bVar.f31160g = (y5.b) this.f30721c;
        bVar.f31159f = file;
        Runnable runnable = bVar.f31161h;
        if (runnable != null) {
            runnable.run();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:99:0x00dd  */
    @Override // p0.c.InterfaceC0425c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String g(final p0.c.a r13) {
        /*
            Method dump skipped, instructions count: 426
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: y.i0.g(p0.c$a):java.lang.String");
    }

    @Override // androidx.appcompat.widget.Toolbar.f
    public final void onMenuItemClick(MenuItem menuItem) {
        int height;
        Bitmap bitmap;
        ph.y yVar = (ph.y) this.f30720b;
        Toolbar toolbar = (Toolbar) this.f30721c;
        int i10 = ph.y.f24249o0;
        gm.l.f(yVar, "this$0");
        gm.l.f(toolbar, "$this_initShare");
        if (menuItem.getItemId() == R.id.menu_share) {
            Integer g12 = yVar.g1();
            if (g12 != null) {
                height = g12.intValue();
            } else {
                height = toolbar.getHeight();
            }
            View view = yVar.H;
            if (view == null) {
                bitmap = null;
            } else {
                Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight() - height, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                canvas.translate(0.0f, -height);
                view.draw(canvas);
                bitmap = createBitmap;
            }
            if (bitmap != null) {
                pm.k.c(yVar.V0(), bitmap);
            }
        }
    }
}
