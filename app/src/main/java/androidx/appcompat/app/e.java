package androidx.appcompat.app;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.widget.w2;
import androidx.fragment.app.x;
import androidx.lifecycle.runtime.R;
import f.f;
import f.g;
import f.h;
import f.i;
import f.j;
import f.w;
import gm.l;
import x0.b;
import x0.i0;
import x0.p;

/* loaded from: classes.dex */
public class e extends x implements h {

    /* renamed from: t */
    public j f840t;

    public e() {
        this.f702e.f24512b.c("androidx:appcompat", new f(this));
        H(new g(this));
    }

    private void I() {
        getWindow().getDecorView().setTag(R.id.view_tree_lifecycle_owner, this);
        getWindow().getDecorView().setTag(androidx.lifecycle.viewmodel.R.id.view_tree_view_model_store_owner, this);
        View decorView = getWindow().getDecorView();
        l.f(decorView, "<this>");
        decorView.setTag(androidx.savedstate.R.id.view_tree_saved_state_registry_owner, this);
    }

    @Override // f.h
    public final void B() {
    }

    public final i L() {
        if (this.f840t == null) {
            int i10 = i.f13880a;
            this.f840t = new j(this, null, this, this);
        }
        return this.f840t;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        I();
        L().c(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(L().e(context));
    }

    @Override // android.app.Activity
    public final void closeOptionsMenu() {
        ((j) L()).K();
        if (getWindow().hasFeature(0)) {
            super.closeOptionsMenu();
        }
    }

    @Override // x0.n, android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        keyEvent.getKeyCode();
        ((j) L()).K();
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    public final <T extends View> T findViewById(int i10) {
        return (T) L().f(i10);
    }

    @Override // android.app.Activity
    public final MenuInflater getMenuInflater() {
        return L().h();
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        int i10 = w2.f1593a;
        return super.getResources();
    }

    @Override // android.app.Activity
    public final void invalidateOptionsMenu() {
        L().j();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        L().k(configuration);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onContentChanged() {
    }

    @Override // androidx.fragment.app.x, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        L().m();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        boolean z10;
        Window window;
        if (Build.VERSION.SDK_INT < 26 && !keyEvent.isCtrlPressed() && !KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) && keyEvent.getRepeatCount() == 0 && !KeyEvent.isModifierKey(keyEvent.getKeyCode()) && (window = getWindow()) != null && window.getDecorView() != null && window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return true;
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // androidx.fragment.app.x, androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i10, MenuItem menuItem) {
        Intent a10;
        if (super.onMenuItemSelected(i10, menuItem)) {
            return true;
        }
        j jVar = (j) L();
        jVar.K();
        w wVar = jVar.f13898i;
        if (menuItem.getItemId() == 16908332 && wVar != null && (wVar.f13998e.r() & 4) != 0 && (a10 = p.a(this)) != null) {
            if (p.a.c(this, a10)) {
                i0 i0Var = new i0(this);
                Intent a11 = p.a(this);
                if (a11 == null) {
                    a11 = p.a(this);
                }
                if (a11 != null) {
                    ComponentName component = a11.getComponent();
                    if (component == null) {
                        component = a11.resolveActivity(i0Var.f30124b.getPackageManager());
                    }
                    i0Var.e(component);
                    i0Var.f30123a.add(a11);
                }
                i0Var.f();
                try {
                    int i11 = x0.b.f30088b;
                    b.a.a(this);
                    return true;
                } catch (IllegalStateException unused) {
                    finish();
                    return true;
                }
            }
            p.a.b(this, a10);
            return true;
        }
        return false;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onMenuOpened(int i10, Menu menu) {
        return super.onMenuOpened(i10, menu);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public final void onPanelClosed(int i10, Menu menu) {
        super.onPanelClosed(i10, menu);
    }

    @Override // android.app.Activity
    public final void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        ((j) L()).F();
    }

    @Override // androidx.fragment.app.x, android.app.Activity
    public final void onPostResume() {
        super.onPostResume();
        L().n();
    }

    @Override // androidx.fragment.app.x, android.app.Activity
    public void onStart() {
        super.onStart();
        L().o();
    }

    @Override // androidx.fragment.app.x, android.app.Activity
    public void onStop() {
        super.onStop();
        L().p();
    }

    @Override // android.app.Activity
    public final void onTitleChanged(CharSequence charSequence, int i10) {
        super.onTitleChanged(charSequence, i10);
        L().w(charSequence);
    }

    @Override // android.app.Activity
    public final void openOptionsMenu() {
        ((j) L()).K();
        if (getWindow().hasFeature(0)) {
            super.openOptionsMenu();
        }
    }

    @Override // f.h
    public final void p() {
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void setContentView(int i10) {
        I();
        L().s(i10);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        I();
        L().t(view);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        I();
        L().u(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i10) {
        super.setTheme(i10);
        L().v(i10);
    }

    @Override // f.h
    public final void w() {
    }
}
