package androidx.activity;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.lifecycle.k;
import androidx.lifecycle.u;
import androidx.lifecycle.v;

/* loaded from: classes.dex */
public class j extends Dialog implements u, l {

    /* renamed from: a */
    public v f743a;

    /* renamed from: b */
    public final OnBackPressedDispatcher f744b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Context context, int i10) {
        super(context, i10);
        gm.l.f(context, "context");
        this.f744b = new OnBackPressedDispatcher(new h(0, this));
    }

    public static void c(j jVar) {
        gm.l.f(jVar, "this$0");
        super.onBackPressed();
    }

    @Override // androidx.lifecycle.u
    public final v a0() {
        v vVar = this.f743a;
        if (vVar == null) {
            v vVar2 = new v(this);
            this.f743a = vVar2;
            return vVar2;
        }
        return vVar;
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        gm.l.f(view, "view");
        d();
        super.addContentView(view, layoutParams);
    }

    @Override // androidx.activity.l
    public final OnBackPressedDispatcher b() {
        return this.f744b;
    }

    public final void d() {
        Window window = getWindow();
        gm.l.c(window);
        window.getDecorView().setTag(androidx.lifecycle.runtime.R.id.view_tree_lifecycle_owner, this);
        Window window2 = getWindow();
        gm.l.c(window2);
        View decorView = window2.getDecorView();
        gm.l.e(decorView, "window!!.decorView");
        decorView.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        this.f744b.b();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        v vVar = this.f743a;
        if (vVar == null) {
            vVar = new v(this);
            this.f743a = vVar;
        }
        vVar.f(k.b.ON_CREATE);
    }

    @Override // android.app.Dialog
    public void onStart() {
        super.onStart();
        v vVar = this.f743a;
        if (vVar == null) {
            vVar = new v(this);
            this.f743a = vVar;
        }
        vVar.f(k.b.ON_RESUME);
    }

    @Override // android.app.Dialog
    public void onStop() {
        v vVar = this.f743a;
        if (vVar == null) {
            vVar = new v(this);
            this.f743a = vVar;
        }
        vVar.f(k.b.ON_DESTROY);
        this.f743a = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(int i10) {
        d();
        super.setContentView(i10);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        gm.l.f(view, "view");
        d();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        gm.l.f(view, "view");
        d();
        super.setContentView(view, layoutParams);
    }
}
