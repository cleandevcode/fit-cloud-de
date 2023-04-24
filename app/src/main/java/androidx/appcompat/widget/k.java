package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.Log;
import androidx.appcompat.R;
import androidx.appcompat.widget.z1;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: b */
    public static final PorterDuff.Mode f1384b = PorterDuff.Mode.SRC_IN;

    /* renamed from: c */
    public static k f1385c;

    /* renamed from: a */
    public z1 f1386a;

    /* loaded from: classes.dex */
    public class a implements z1.f {

        /* renamed from: a */
        public final int[] f1387a = {R.drawable.abc_textfield_search_default_mtrl_alpha, R.drawable.abc_textfield_default_mtrl_alpha, R.drawable.abc_ab_share_pack_mtrl_alpha};

        /* renamed from: b */
        public final int[] f1388b = {R.drawable.abc_ic_commit_search_api_mtrl_alpha, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};

        /* renamed from: c */
        public final int[] f1389c = {R.drawable.abc_textfield_activated_mtrl_alpha, R.drawable.abc_textfield_search_activated_mtrl_alpha, R.drawable.abc_cab_background_top_mtrl_alpha, R.drawable.abc_text_cursor_material, R.drawable.abc_text_select_handle_left_mtrl, R.drawable.abc_text_select_handle_middle_mtrl, R.drawable.abc_text_select_handle_right_mtrl};

        /* renamed from: d */
        public final int[] f1390d = {R.drawable.abc_popup_background_mtrl_mult, R.drawable.abc_cab_background_internal_bg, R.drawable.abc_menu_hardkey_panel_mtrl_mult};

        /* renamed from: e */
        public final int[] f1391e = {R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};

        /* renamed from: f */
        public final int[] f1392f = {R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};

        public static boolean a(int i10, int[] iArr) {
            for (int i11 : iArr) {
                if (i11 == i10) {
                    return true;
                }
            }
            return false;
        }

        public static ColorStateList b(Context context, int i10) {
            int c10 = g2.c(context, R.attr.colorControlHighlight);
            return new ColorStateList(new int[][]{g2.f1354b, g2.f1356d, g2.f1355c, g2.f1358f}, new int[]{g2.b(context, R.attr.colorButtonNormal), a1.a.b(c10, i10), a1.a.b(c10, i10), i10});
        }

        public static void d(Drawable drawable, int i10, PorterDuff.Mode mode) {
            int[] iArr = k1.f1396a;
            Drawable mutate = drawable.mutate();
            if (mode == null) {
                mode = k.f1384b;
            }
            mutate.setColorFilter(k.c(i10, mode));
        }

        public final ColorStateList c(Context context, int i10) {
            if (i10 == R.drawable.abc_edit_text_material) {
                return g.a.a(context, R.color.abc_tint_edittext);
            }
            if (i10 == R.drawable.abc_switch_track_mtrl_alpha) {
                return g.a.a(context, R.color.abc_tint_switch_track);
            }
            if (i10 == R.drawable.abc_switch_thumb_material) {
                int[][] iArr = new int[3];
                int[] iArr2 = new int[3];
                int i11 = R.attr.colorSwitchThumbNormal;
                ColorStateList d10 = g2.d(context, i11);
                if (d10 != null && d10.isStateful()) {
                    int[] iArr3 = g2.f1354b;
                    iArr[0] = iArr3;
                    iArr2[0] = d10.getColorForState(iArr3, 0);
                    iArr[1] = g2.f1357e;
                    iArr2[1] = g2.c(context, R.attr.colorControlActivated);
                    iArr[2] = g2.f1358f;
                    iArr2[2] = d10.getDefaultColor();
                } else {
                    iArr[0] = g2.f1354b;
                    iArr2[0] = g2.b(context, i11);
                    iArr[1] = g2.f1357e;
                    iArr2[1] = g2.c(context, R.attr.colorControlActivated);
                    iArr[2] = g2.f1358f;
                    iArr2[2] = g2.c(context, i11);
                }
                return new ColorStateList(iArr, iArr2);
            } else if (i10 == R.drawable.abc_btn_default_mtrl_shape) {
                return b(context, g2.c(context, R.attr.colorButtonNormal));
            } else {
                if (i10 == R.drawable.abc_btn_borderless_material) {
                    return b(context, 0);
                }
                if (i10 == R.drawable.abc_btn_colored_material) {
                    return b(context, g2.c(context, R.attr.colorAccent));
                }
                if (i10 != R.drawable.abc_spinner_mtrl_am_alpha && i10 != R.drawable.abc_spinner_textfield_background_material) {
                    if (a(i10, this.f1388b)) {
                        return g2.d(context, R.attr.colorControlNormal);
                    }
                    if (a(i10, this.f1391e)) {
                        return g.a.a(context, R.color.abc_tint_default);
                    }
                    if (a(i10, this.f1392f)) {
                        return g.a.a(context, R.color.abc_tint_btn_checkable);
                    }
                    if (i10 == R.drawable.abc_seekbar_thumb_material) {
                        return g.a.a(context, R.color.abc_tint_seek_thumb);
                    }
                    return null;
                }
                return g.a.a(context, R.color.abc_tint_spinner);
            }
        }
    }

    public static synchronized k a() {
        k kVar;
        synchronized (k.class) {
            if (f1385c == null) {
                d();
            }
            kVar = f1385c;
        }
        return kVar;
    }

    public static synchronized PorterDuffColorFilter c(int i10, PorterDuff.Mode mode) {
        PorterDuffColorFilter h10;
        synchronized (k.class) {
            h10 = z1.h(i10, mode);
        }
        return h10;
    }

    public static synchronized void d() {
        synchronized (k.class) {
            if (f1385c == null) {
                k kVar = new k();
                f1385c = kVar;
                kVar.f1386a = z1.d();
                z1 z1Var = f1385c.f1386a;
                a aVar = new a();
                synchronized (z1Var) {
                    z1Var.f1608g = aVar;
                }
            }
        }
    }

    public static void e(Drawable drawable, j2 j2Var, int[] iArr) {
        boolean z10;
        ColorStateList colorStateList;
        PorterDuff.Mode mode;
        PorterDuff.Mode mode2 = z1.f1599h;
        int[] state = drawable.getState();
        int[] iArr2 = k1.f1396a;
        if (drawable.mutate() == drawable) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z11 = j2Var.f1383d;
        if (!z11 && !j2Var.f1382c) {
            drawable.clearColorFilter();
        } else {
            PorterDuffColorFilter porterDuffColorFilter = null;
            if (z11) {
                colorStateList = j2Var.f1380a;
            } else {
                colorStateList = null;
            }
            if (j2Var.f1382c) {
                mode = j2Var.f1381b;
            } else {
                mode = z1.f1599h;
            }
            if (colorStateList != null && mode != null) {
                porterDuffColorFilter = z1.h(colorStateList.getColorForState(iArr, 0), mode);
            }
            drawable.setColorFilter(porterDuffColorFilter);
        }
        if (Build.VERSION.SDK_INT <= 23) {
            drawable.invalidateSelf();
        }
    }

    public final synchronized Drawable b(Context context, int i10) {
        return this.f1386a.f(context, i10);
    }
}
