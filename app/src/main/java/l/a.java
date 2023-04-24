package l;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import b1.a;
import y0.a;

/* loaded from: classes.dex */
public final class a implements c1.b {

    /* renamed from: a */
    public CharSequence f18632a;

    /* renamed from: b */
    public CharSequence f18633b;

    /* renamed from: c */
    public Intent f18634c;

    /* renamed from: d */
    public char f18635d;

    /* renamed from: f */
    public char f18637f;

    /* renamed from: h */
    public Drawable f18639h;

    /* renamed from: i */
    public Context f18640i;

    /* renamed from: j */
    public CharSequence f18641j;

    /* renamed from: k */
    public CharSequence f18642k;

    /* renamed from: e */
    public int f18636e = 4096;

    /* renamed from: g */
    public int f18638g = 4096;

    /* renamed from: l */
    public ColorStateList f18643l = null;

    /* renamed from: m */
    public PorterDuff.Mode f18644m = null;

    /* renamed from: n */
    public boolean f18645n = false;

    /* renamed from: o */
    public boolean f18646o = false;

    /* renamed from: p */
    public int f18647p = 16;

    public a(Context context, CharSequence charSequence) {
        this.f18640i = context;
        this.f18632a = charSequence;
    }

    @Override // c1.b
    public final c1.b a(k1.b bVar) {
        throw new UnsupportedOperationException();
    }

    @Override // c1.b
    public final k1.b b() {
        return null;
    }

    public final void c() {
        Drawable drawable = this.f18639h;
        if (drawable != null) {
            if (this.f18645n || this.f18646o) {
                Drawable g10 = b1.a.g(drawable);
                this.f18639h = g10;
                Drawable mutate = g10.mutate();
                this.f18639h = mutate;
                if (this.f18645n) {
                    a.b.h(mutate, this.f18643l);
                }
                if (this.f18646o) {
                    a.b.i(this.f18639h, this.f18644m);
                }
            }
        }
    }

    @Override // c1.b, android.view.MenuItem
    public final boolean collapseActionView() {
        return false;
    }

    @Override // c1.b, android.view.MenuItem
    public final boolean expandActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // c1.b, android.view.MenuItem
    public final View getActionView() {
        return null;
    }

    @Override // c1.b, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f18638g;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f18637f;
    }

    @Override // c1.b, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f18641j;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        return this.f18639h;
    }

    @Override // c1.b, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f18643l;
    }

    @Override // c1.b, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f18644m;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f18634c;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return 16908332;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // c1.b, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f18636e;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f18635d;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f18632a;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f18633b;
        return charSequence != null ? charSequence : this.f18632a;
    }

    @Override // c1.b, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f18642k;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return false;
    }

    @Override // c1.b, android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f18647p & 1) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f18647p & 2) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f18647p & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        return (this.f18647p & 8) == 0;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // c1.b, android.view.MenuItem
    public final MenuItem setActionView(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c10) {
        this.f18637f = Character.toLowerCase(c10);
        return this;
    }

    @Override // c1.b, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c10, int i10) {
        this.f18637f = Character.toLowerCase(c10);
        this.f18638g = KeyEvent.normalizeMetaState(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z10) {
        this.f18647p = (z10 ? 1 : 0) | (this.f18647p & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z10) {
        this.f18647p = (z10 ? 2 : 0) | (this.f18647p & (-3));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.f18641j = charSequence;
        return this;
    }

    @Override // c1.b, android.view.MenuItem
    public final c1.b setContentDescription(CharSequence charSequence) {
        this.f18641j = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z10) {
        this.f18647p = (z10 ? 16 : 0) | (this.f18647p & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i10) {
        Context context = this.f18640i;
        Object obj = y0.a.f30807a;
        this.f18639h = a.c.b(context, i10);
        c();
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f18639h = drawable;
        c();
        return this;
    }

    @Override // c1.b, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f18643l = colorStateList;
        this.f18645n = true;
        c();
        return this;
    }

    @Override // c1.b, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f18644m = mode;
        this.f18646o = true;
        c();
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f18634c = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c10) {
        this.f18635d = c10;
        return this;
    }

    @Override // c1.b, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c10, int i10) {
        this.f18635d = c10;
        this.f18636e = KeyEvent.normalizeMetaState(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c10, char c11) {
        this.f18635d = c10;
        this.f18637f = Character.toLowerCase(c11);
        return this;
    }

    @Override // c1.b, android.view.MenuItem
    public final MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.f18635d = c10;
        this.f18636e = KeyEvent.normalizeMetaState(i10);
        this.f18637f = Character.toLowerCase(c11);
        this.f18638g = KeyEvent.normalizeMetaState(i11);
        return this;
    }

    @Override // c1.b, android.view.MenuItem
    public final void setShowAsAction(int i10) {
    }

    @Override // c1.b, android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i10) {
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i10) {
        this.f18632a = this.f18640i.getResources().getString(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f18632a = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f18633b = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.f18642k = charSequence;
        return this;
    }

    @Override // c1.b, android.view.MenuItem
    public final c1.b setTooltipText(CharSequence charSequence) {
        this.f18642k = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z10) {
        this.f18647p = (this.f18647p & 8) | (z10 ? 0 : 8);
        return this;
    }

    @Override // c1.b, android.view.MenuItem
    public final MenuItem setActionView(View view) {
        throw new UnsupportedOperationException();
    }
}
