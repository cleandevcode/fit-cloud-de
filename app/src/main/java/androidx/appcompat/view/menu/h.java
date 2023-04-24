package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import b1.a;
import k1.b;

/* loaded from: classes.dex */
public final class h implements c1.b {
    public k1.b A;
    public MenuItem.OnActionExpandListener B;

    /* renamed from: a */
    public final int f959a;

    /* renamed from: b */
    public final int f960b;

    /* renamed from: c */
    public final int f961c;

    /* renamed from: d */
    public final int f962d;

    /* renamed from: e */
    public CharSequence f963e;

    /* renamed from: f */
    public CharSequence f964f;

    /* renamed from: g */
    public Intent f965g;

    /* renamed from: h */
    public char f966h;

    /* renamed from: j */
    public char f968j;

    /* renamed from: l */
    public Drawable f970l;

    /* renamed from: n */
    public f f972n;

    /* renamed from: o */
    public m f973o;

    /* renamed from: p */
    public MenuItem.OnMenuItemClickListener f974p;

    /* renamed from: q */
    public CharSequence f975q;

    /* renamed from: r */
    public CharSequence f976r;

    /* renamed from: y */
    public int f983y;

    /* renamed from: z */
    public View f984z;

    /* renamed from: i */
    public int f967i = 4096;

    /* renamed from: k */
    public int f969k = 4096;

    /* renamed from: m */
    public int f971m = 0;

    /* renamed from: s */
    public ColorStateList f977s = null;

    /* renamed from: t */
    public PorterDuff.Mode f978t = null;

    /* renamed from: u */
    public boolean f979u = false;

    /* renamed from: v */
    public boolean f980v = false;

    /* renamed from: w */
    public boolean f981w = false;

    /* renamed from: x */
    public int f982x = 16;
    public boolean C = false;

    /* loaded from: classes.dex */
    public class a implements b.a {
        public a() {
            h.this = r1;
        }
    }

    public h(f fVar, int i10, int i11, int i12, int i13, CharSequence charSequence, int i14) {
        this.f972n = fVar;
        this.f959a = i11;
        this.f960b = i10;
        this.f961c = i12;
        this.f962d = i13;
        this.f963e = charSequence;
        this.f983y = i14;
    }

    public static void c(String str, int i10, int i11, StringBuilder sb2) {
        if ((i10 & i11) == i11) {
            sb2.append(str);
        }
    }

    @Override // c1.b
    public final c1.b a(k1.b bVar) {
        k1.b bVar2 = this.A;
        if (bVar2 != null) {
            bVar2.f18093a = null;
        }
        this.f984z = null;
        this.A = bVar;
        this.f972n.p(true);
        k1.b bVar3 = this.A;
        if (bVar3 != null) {
            bVar3.h(new a());
        }
        return this;
    }

    @Override // c1.b
    public final k1.b b() {
        return this.A;
    }

    @Override // c1.b, android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.f983y & 8) == 0) {
            return false;
        }
        if (this.f984z == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f972n.d(this);
        }
        return false;
    }

    public final Drawable d(Drawable drawable) {
        if (drawable != null && this.f981w && (this.f979u || this.f980v)) {
            drawable = b1.a.g(drawable).mutate();
            if (this.f979u) {
                a.b.h(drawable, this.f977s);
            }
            if (this.f980v) {
                a.b.i(drawable, this.f978t);
            }
            this.f981w = false;
        }
        return drawable;
    }

    public final boolean e() {
        k1.b bVar;
        if ((this.f983y & 8) != 0) {
            if (this.f984z == null && (bVar = this.A) != null) {
                this.f984z = bVar.d(this);
            }
            return this.f984z != null;
        }
        return false;
    }

    @Override // c1.b, android.view.MenuItem
    public final boolean expandActionView() {
        if (e()) {
            MenuItem.OnActionExpandListener onActionExpandListener = this.B;
            if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
                return this.f972n.f(this);
            }
            return false;
        }
        return false;
    }

    public final void f(boolean z10) {
        this.f982x = z10 ? this.f982x | 32 : this.f982x & (-33);
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // c1.b, android.view.MenuItem
    public final View getActionView() {
        View view = this.f984z;
        if (view != null) {
            return view;
        }
        k1.b bVar = this.A;
        if (bVar != null) {
            View d10 = bVar.d(this);
            this.f984z = d10;
            return d10;
        }
        return null;
    }

    @Override // c1.b, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f969k;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f968j;
    }

    @Override // c1.b, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f975q;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f960b;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        Drawable drawable = this.f970l;
        if (drawable != null) {
            return d(drawable);
        }
        int i10 = this.f971m;
        if (i10 != 0) {
            Drawable b10 = g.a.b(this.f972n.f932a, i10);
            this.f971m = 0;
            this.f970l = b10;
            return d(b10);
        }
        return null;
    }

    @Override // c1.b, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f977s;
    }

    @Override // c1.b, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f978t;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f965g;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public final int getItemId() {
        return this.f959a;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // c1.b, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f967i;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f966h;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.f961c;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.f973o;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public final CharSequence getTitle() {
        return this.f963e;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f964f;
        return charSequence != null ? charSequence : this.f963e;
    }

    @Override // c1.b, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f976r;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.f973o != null;
    }

    @Override // c1.b, android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.C;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f982x & 1) == 1;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f982x & 2) == 2;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f982x & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        k1.b bVar = this.A;
        return (bVar == null || !bVar.g()) ? (this.f982x & 8) == 0 : (this.f982x & 8) == 0 && this.A.b();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // c1.b, android.view.MenuItem
    public final MenuItem setActionView(int i10) {
        int i11;
        Context context = this.f972n.f932a;
        View inflate = LayoutInflater.from(context).inflate(i10, (ViewGroup) new LinearLayout(context), false);
        this.f984z = inflate;
        this.A = null;
        if (inflate != null && inflate.getId() == -1 && (i11 = this.f959a) > 0) {
            inflate.setId(i11);
        }
        f fVar = this.f972n;
        fVar.f942k = true;
        fVar.p(true);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c10) {
        if (this.f968j == c10) {
            return this;
        }
        this.f968j = Character.toLowerCase(c10);
        this.f972n.p(false);
        return this;
    }

    @Override // c1.b, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c10, int i10) {
        if (this.f968j == c10 && this.f969k == i10) {
            return this;
        }
        this.f968j = Character.toLowerCase(c10);
        this.f969k = KeyEvent.normalizeMetaState(i10);
        this.f972n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z10) {
        int i10 = this.f982x;
        int i11 = (z10 ? 1 : 0) | (i10 & (-2));
        this.f982x = i11;
        if (i10 != i11) {
            this.f972n.p(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z10) {
        boolean z11;
        int i10;
        int i11 = this.f982x;
        int i12 = 2;
        if ((i11 & 4) != 0) {
            f fVar = this.f972n;
            fVar.getClass();
            int i13 = this.f960b;
            int size = fVar.f937f.size();
            fVar.w();
            for (int i14 = 0; i14 < size; i14++) {
                h hVar = fVar.f937f.get(i14);
                if (hVar.f960b == i13) {
                    boolean z12 = true;
                    if ((hVar.f982x & 4) != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11 && hVar.isCheckable()) {
                        if (hVar != this) {
                            z12 = false;
                        }
                        int i15 = hVar.f982x;
                        int i16 = i15 & (-3);
                        if (z12) {
                            i10 = 2;
                        } else {
                            i10 = 0;
                        }
                        int i17 = i10 | i16;
                        hVar.f982x = i17;
                        if (i15 != i17) {
                            hVar.f972n.p(false);
                        }
                    }
                }
            }
            fVar.v();
        } else {
            int i18 = i11 & (-3);
            if (!z10) {
                i12 = 0;
            }
            int i19 = i12 | i18;
            this.f982x = i19;
            if (i11 != i19) {
                this.f972n.p(false);
            }
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        setContentDescription(charSequence);
        return this;
    }

    @Override // c1.b, android.view.MenuItem
    public final c1.b setContentDescription(CharSequence charSequence) {
        this.f975q = charSequence;
        this.f972n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z10) {
        this.f982x = z10 ? this.f982x | 16 : this.f982x & (-17);
        this.f972n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i10) {
        this.f970l = null;
        this.f971m = i10;
        this.f981w = true;
        this.f972n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f971m = 0;
        this.f970l = drawable;
        this.f981w = true;
        this.f972n.p(false);
        return this;
    }

    @Override // c1.b, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f977s = colorStateList;
        this.f979u = true;
        this.f981w = true;
        this.f972n.p(false);
        return this;
    }

    @Override // c1.b, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f978t = mode;
        this.f980v = true;
        this.f981w = true;
        this.f972n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f965g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c10) {
        if (this.f966h == c10) {
            return this;
        }
        this.f966h = c10;
        this.f972n.p(false);
        return this;
    }

    @Override // c1.b, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c10, int i10) {
        if (this.f966h == c10 && this.f967i == i10) {
            return this;
        }
        this.f966h = c10;
        this.f967i = KeyEvent.normalizeMetaState(i10);
        this.f972n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.B = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f974p = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c10, char c11) {
        this.f966h = c10;
        this.f968j = Character.toLowerCase(c11);
        this.f972n.p(false);
        return this;
    }

    @Override // c1.b, android.view.MenuItem
    public final MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.f966h = c10;
        this.f967i = KeyEvent.normalizeMetaState(i10);
        this.f968j = Character.toLowerCase(c11);
        this.f969k = KeyEvent.normalizeMetaState(i11);
        this.f972n.p(false);
        return this;
    }

    @Override // c1.b, android.view.MenuItem
    public final void setShowAsAction(int i10) {
        int i11 = i10 & 3;
        if (i11 != 0 && i11 != 1 && i11 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f983y = i10;
        f fVar = this.f972n;
        fVar.f942k = true;
        fVar.p(true);
    }

    @Override // c1.b, android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i10) {
        setShowAsAction(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i10) {
        setTitle(this.f972n.f932a.getString(i10));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f963e = charSequence;
        this.f972n.p(false);
        m mVar = this.f973o;
        if (mVar != null) {
            mVar.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f964f = charSequence;
        this.f972n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        setTooltipText(charSequence);
        return this;
    }

    @Override // c1.b, android.view.MenuItem
    public final c1.b setTooltipText(CharSequence charSequence) {
        this.f976r = charSequence;
        this.f972n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z10) {
        int i10;
        int i11 = this.f982x;
        int i12 = i11 & (-9);
        boolean z11 = false;
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        int i13 = i10 | i12;
        this.f982x = i13;
        if (i11 != i13) {
            z11 = true;
        }
        if (z11) {
            f fVar = this.f972n;
            fVar.f939h = true;
            fVar.p(true);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.f963e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override // c1.b, android.view.MenuItem
    public final MenuItem setActionView(View view) {
        int i10;
        this.f984z = view;
        this.A = null;
        if (view != null && view.getId() == -1 && (i10 = this.f959a) > 0) {
            view.setId(i10);
        }
        f fVar = this.f972n;
        fVar.f942k = true;
        fVar.p(true);
        return this;
    }
}
