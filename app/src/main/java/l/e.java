package l;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import o0.h;

/* loaded from: classes.dex */
public class e extends b implements Menu {

    /* renamed from: d */
    public final c1.a f18662d;

    public e(Context context, c1.a aVar) {
        super(context);
        if (aVar == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f18662d = aVar;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i10) {
        return c(this.f18662d.add(i10));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i10, int i11, int i12, int i13) {
        return c(this.f18662d.add(i10, i11, i12, i13));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i10, int i11, int i12, CharSequence charSequence) {
        return c(this.f18662d.add(i10, i11, i12, charSequence));
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return c(this.f18662d.add(charSequence));
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i10, int i11, int i12, ComponentName componentName, Intent[] intentArr, Intent intent, int i13, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr != null ? new MenuItem[menuItemArr.length] : null;
        int addIntentOptions = this.f18662d.addIntentOptions(i10, i11, i12, componentName, intentArr, intent, i13, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i14 = 0; i14 < length; i14++) {
                menuItemArr[i14] = c(menuItemArr2[i14]);
            }
        }
        return addIntentOptions;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i10) {
        return d(this.f18662d.addSubMenu(i10));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i10, int i11, int i12, int i13) {
        return d(this.f18662d.addSubMenu(i10, i11, i12, i13));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i10, int i11, int i12, CharSequence charSequence) {
        return d(this.f18662d.addSubMenu(i10, i11, i12, charSequence));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return d(this.f18662d.addSubMenu(charSequence));
    }

    @Override // android.view.Menu
    public final void clear() {
        h<c1.b, MenuItem> hVar = this.f18649b;
        if (hVar != null) {
            hVar.clear();
        }
        h<c1.c, SubMenu> hVar2 = this.f18650c;
        if (hVar2 != null) {
            hVar2.clear();
        }
        this.f18662d.clear();
    }

    @Override // android.view.Menu
    public final void close() {
        this.f18662d.close();
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i10) {
        return c(this.f18662d.findItem(i10));
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i10) {
        return c(this.f18662d.getItem(i10));
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        return this.f18662d.hasVisibleItems();
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i10, KeyEvent keyEvent) {
        return this.f18662d.isShortcutKey(i10, keyEvent);
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i10, int i11) {
        return this.f18662d.performIdentifierAction(i10, i11);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i10, KeyEvent keyEvent, int i11) {
        return this.f18662d.performShortcut(i10, keyEvent, i11);
    }

    @Override // android.view.Menu
    public final void removeGroup(int i10) {
        if (this.f18649b != null) {
            int i11 = 0;
            while (true) {
                h<c1.b, MenuItem> hVar = this.f18649b;
                if (i11 >= hVar.f22552c) {
                    break;
                }
                if (hVar.i(i11).getGroupId() == i10) {
                    this.f18649b.k(i11);
                    i11--;
                }
                i11++;
            }
        }
        this.f18662d.removeGroup(i10);
    }

    @Override // android.view.Menu
    public final void removeItem(int i10) {
        if (this.f18649b != null) {
            int i11 = 0;
            while (true) {
                h<c1.b, MenuItem> hVar = this.f18649b;
                if (i11 >= hVar.f22552c) {
                    break;
                } else if (hVar.i(i11).getItemId() == i10) {
                    this.f18649b.k(i11);
                    break;
                } else {
                    i11++;
                }
            }
        }
        this.f18662d.removeItem(i10);
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i10, boolean z10, boolean z11) {
        this.f18662d.setGroupCheckable(i10, z10, z11);
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i10, boolean z10) {
        this.f18662d.setGroupEnabled(i10, z10);
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i10, boolean z10) {
        this.f18662d.setGroupVisible(i10, z10);
    }

    @Override // android.view.Menu
    public final void setQwertyMode(boolean z10) {
        this.f18662d.setQwertyMode(z10);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f18662d.size();
    }
}
