package com.google.android.material.circularreveal;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.google.android.material.circularreveal.c;

/* loaded from: classes.dex */
public class CircularRevealFrameLayout extends FrameLayout implements c {

    /* renamed from: a */
    public final b f6421a;

    public CircularRevealFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6421a = new b(this);
    }

    @Override // com.google.android.material.circularreveal.c
    public final void a() {
        this.f6421a.getClass();
    }

    @Override // com.google.android.material.circularreveal.c
    public final void b() {
        this.f6421a.getClass();
    }

    @Override // com.google.android.material.circularreveal.b.a
    public final void c(Canvas canvas) {
        super.draw(canvas);
    }

    @Override // com.google.android.material.circularreveal.b.a
    public final boolean d() {
        return super.isOpaque();
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x0033, code lost:
        if (r1 != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x004a, code lost:
        if (r1 != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x004c, code lost:
        r11.drawRect(0.0f, 0.0f, r0.f6423b.getWidth(), r0.f6423b.getHeight(), r0.f6424c);
     */
    /* JADX WARN: Removed duplicated region for block: B:55:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    @Override // android.view.View
    @android.annotation.SuppressLint({"MissingSuperCall"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void draw(android.graphics.Canvas r11) {
        /*
            r10 = this;
            com.google.android.material.circularreveal.b r0 = r10.f6421a
            if (r0 == 0) goto L97
            com.google.android.material.circularreveal.c$d r1 = r0.f6425d
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L1b
            float r1 = r1.f6433c
            r4 = 2139095039(0x7f7fffff, float:3.4028235E38)
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 != 0) goto L15
            r1 = 1
            goto L16
        L15:
            r1 = 0
        L16:
            if (r1 == 0) goto L19
            goto L1b
        L19:
            r1 = 0
            goto L1c
        L1b:
            r1 = 1
        L1c:
            r1 = r1 ^ r3
            if (r1 == 0) goto L36
            com.google.android.material.circularreveal.b$a r1 = r0.f6422a
            r1.c(r11)
            android.graphics.Paint r1 = r0.f6424c
            int r1 = r1.getColor()
            int r1 = android.graphics.Color.alpha(r1)
            if (r1 == 0) goto L32
            r1 = 1
            goto L33
        L32:
            r1 = 0
        L33:
            if (r1 == 0) goto L62
            goto L4c
        L36:
            com.google.android.material.circularreveal.b$a r1 = r0.f6422a
            r1.c(r11)
            android.graphics.Paint r1 = r0.f6424c
            int r1 = r1.getColor()
            int r1 = android.graphics.Color.alpha(r1)
            if (r1 == 0) goto L49
            r1 = 1
            goto L4a
        L49:
            r1 = 0
        L4a:
            if (r1 == 0) goto L62
        L4c:
            r5 = 0
            r6 = 0
            android.view.View r1 = r0.f6423b
            int r1 = r1.getWidth()
            float r7 = (float) r1
            android.view.View r1 = r0.f6423b
            int r1 = r1.getHeight()
            float r8 = (float) r1
            android.graphics.Paint r9 = r0.f6424c
            r4 = r11
            r4.drawRect(r5, r6, r7, r8, r9)
        L62:
            android.graphics.drawable.Drawable r1 = r0.f6426e
            if (r1 == 0) goto L6b
            com.google.android.material.circularreveal.c$d r4 = r0.f6425d
            if (r4 == 0) goto L6b
            r2 = 1
        L6b:
            if (r2 == 0) goto L9a
            android.graphics.Rect r1 = r1.getBounds()
            com.google.android.material.circularreveal.c$d r2 = r0.f6425d
            float r2 = r2.f6431a
            int r3 = r1.width()
            float r3 = (float) r3
            r4 = 1073741824(0x40000000, float:2.0)
            float r3 = r3 / r4
            float r2 = r2 - r3
            com.google.android.material.circularreveal.c$d r3 = r0.f6425d
            float r3 = r3.f6432b
            int r1 = r1.height()
            float r1 = (float) r1
            float r1 = r1 / r4
            float r3 = r3 - r1
            r11.translate(r2, r3)
            android.graphics.drawable.Drawable r0 = r0.f6426e
            r0.draw(r11)
            float r0 = -r2
            float r1 = -r3
            r11.translate(r0, r1)
            goto L9a
        L97:
            super.draw(r11)
        L9a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.circularreveal.CircularRevealFrameLayout.draw(android.graphics.Canvas):void");
    }

    public Drawable getCircularRevealOverlayDrawable() {
        return this.f6421a.f6426e;
    }

    @Override // com.google.android.material.circularreveal.c
    public int getCircularRevealScrimColor() {
        return this.f6421a.f6424c.getColor();
    }

    @Override // com.google.android.material.circularreveal.c
    public c.d getRevealInfo() {
        boolean z10;
        b bVar = this.f6421a;
        c.d dVar = bVar.f6425d;
        if (dVar == null) {
            return null;
        }
        c.d dVar2 = new c.d(dVar);
        if (dVar2.f6433c == Float.MAX_VALUE) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            dVar2.f6433c = o8.b.j(dVar2.f6431a, dVar2.f6432b, bVar.f6423b.getWidth(), bVar.f6423b.getHeight());
        }
        return dVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0027 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean isOpaque() {
        /*
            r4 = this;
            com.google.android.material.circularreveal.b r0 = r4.f6421a
            if (r0 == 0) goto L29
            com.google.android.material.circularreveal.b$a r1 = r0.f6422a
            boolean r1 = r1.d()
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L28
            com.google.android.material.circularreveal.c$d r0 = r0.f6425d
            if (r0 == 0) goto L23
            float r0 = r0.f6433c
            r1 = 2139095039(0x7f7fffff, float:3.4028235E38)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L1d
            r0 = 1
            goto L1e
        L1d:
            r0 = 0
        L1e:
            if (r0 == 0) goto L21
            goto L23
        L21:
            r0 = 0
            goto L24
        L23:
            r0 = 1
        L24:
            r0 = r0 ^ r3
            if (r0 != 0) goto L28
            r2 = 1
        L28:
            return r2
        L29:
            boolean r0 = super.isOpaque()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.circularreveal.CircularRevealFrameLayout.isOpaque():boolean");
    }

    @Override // com.google.android.material.circularreveal.c
    public void setCircularRevealOverlayDrawable(Drawable drawable) {
        b bVar = this.f6421a;
        bVar.f6426e = drawable;
        bVar.f6423b.invalidate();
    }

    @Override // com.google.android.material.circularreveal.c
    public void setCircularRevealScrimColor(int i10) {
        b bVar = this.f6421a;
        bVar.f6424c.setColor(i10);
        bVar.f6423b.invalidate();
    }

    @Override // com.google.android.material.circularreveal.c
    public void setRevealInfo(c.d dVar) {
        boolean z10;
        b bVar = this.f6421a;
        if (dVar == null) {
            bVar.f6425d = null;
        } else {
            c.d dVar2 = bVar.f6425d;
            if (dVar2 == null) {
                bVar.f6425d = new c.d(dVar);
            } else {
                float f10 = dVar.f6431a;
                float f11 = dVar.f6432b;
                float f12 = dVar.f6433c;
                dVar2.f6431a = f10;
                dVar2.f6432b = f11;
                dVar2.f6433c = f12;
            }
            if (dVar.f6433c + 1.0E-4f >= o8.b.j(dVar.f6431a, dVar.f6432b, bVar.f6423b.getWidth(), bVar.f6423b.getHeight())) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                bVar.f6425d.f6433c = Float.MAX_VALUE;
            }
        }
        bVar.f6423b.invalidate();
    }
}
