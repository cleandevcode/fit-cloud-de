package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import k1.b2;
import y0.a;

/* loaded from: classes.dex */
public class f implements c1.a {

    /* renamed from: y */
    public static final int[] f931y = {1, 4, 5, 3, 2, 0};

    /* renamed from: a */
    public final Context f932a;

    /* renamed from: b */
    public final Resources f933b;

    /* renamed from: c */
    public boolean f934c;

    /* renamed from: d */
    public boolean f935d;

    /* renamed from: e */
    public a f936e;

    /* renamed from: f */
    public ArrayList<h> f937f;

    /* renamed from: g */
    public ArrayList<h> f938g;

    /* renamed from: h */
    public boolean f939h;

    /* renamed from: i */
    public ArrayList<h> f940i;

    /* renamed from: j */
    public ArrayList<h> f941j;

    /* renamed from: k */
    public boolean f942k;

    /* renamed from: m */
    public CharSequence f944m;

    /* renamed from: n */
    public Drawable f945n;

    /* renamed from: o */
    public View f946o;

    /* renamed from: v */
    public h f953v;

    /* renamed from: x */
    public boolean f955x;

    /* renamed from: l */
    public int f943l = 0;

    /* renamed from: p */
    public boolean f947p = false;

    /* renamed from: q */
    public boolean f948q = false;

    /* renamed from: r */
    public boolean f949r = false;

    /* renamed from: s */
    public boolean f950s = false;

    /* renamed from: t */
    public ArrayList<h> f951t = new ArrayList<>();

    /* renamed from: u */
    public CopyOnWriteArrayList<WeakReference<j>> f952u = new CopyOnWriteArrayList<>();

    /* renamed from: w */
    public boolean f954w = false;

    /* loaded from: classes.dex */
    public interface a {
        boolean a(f fVar, MenuItem menuItem);

        void b(f fVar);
    }

    /* loaded from: classes.dex */
    public interface b {
        boolean a(h hVar);
    }

    public f(Context context) {
        boolean z10;
        boolean z11 = false;
        this.f932a = context;
        Resources resources = context.getResources();
        this.f933b = resources;
        this.f937f = new ArrayList<>();
        this.f938g = new ArrayList<>();
        this.f939h = true;
        this.f940i = new ArrayList<>();
        this.f941j = new ArrayList<>();
        this.f942k = true;
        if (resources.getConfiguration().keyboard != 1) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            Method method = b2.f18094a;
            if (Build.VERSION.SDK_INT >= 28) {
                z10 = b2.b.b(viewConfiguration);
            } else {
                Resources resources2 = context.getResources();
                int identifier = resources2.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
                if (identifier != 0 && resources2.getBoolean(identifier)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            }
            if (z10) {
                z11 = true;
            }
        }
        this.f935d = z11;
    }

    public h a(int i10, int i11, int i12, CharSequence charSequence) {
        int i13;
        int i14 = ((-65536) & i12) >> 16;
        if (i14 >= 0) {
            int[] iArr = f931y;
            if (i14 < 6) {
                int i15 = (iArr[i14] << 16) | (65535 & i12);
                h hVar = new h(this, i10, i11, i12, i15, charSequence, this.f943l);
                ArrayList<h> arrayList = this.f937f;
                int size = arrayList.size();
                while (true) {
                    size--;
                    if (size >= 0) {
                        if (arrayList.get(size).f962d <= i15) {
                            i13 = size + 1;
                            break;
                        }
                    } else {
                        i13 = 0;
                        break;
                    }
                }
                arrayList.add(i13, hVar);
                p(true);
                return hVar;
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    @Override // android.view.Menu
    public final MenuItem add(int i10) {
        return a(0, 0, 0, this.f933b.getString(i10));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i10, int i11, int i12, int i13) {
        return a(i10, i11, i12, this.f933b.getString(i13));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i10, int i11, int i12, CharSequence charSequence) {
        return a(i10, i11, i12, charSequence);
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i10, int i11, int i12, ComponentName componentName, Intent[] intentArr, Intent intent, int i13, MenuItem[] menuItemArr) {
        int i14;
        PackageManager packageManager = this.f932a.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = queryIntentActivityOptions != null ? queryIntentActivityOptions.size() : 0;
        if ((i13 & 1) == 0) {
            removeGroup(i10);
        }
        for (int i15 = 0; i15 < size; i15++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i15);
            int i16 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i16 < 0 ? intent : intentArr[i16]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            h a10 = a(i10, i11, i12, resolveInfo.loadLabel(packageManager));
            a10.setIcon(resolveInfo.loadIcon(packageManager));
            a10.f965g = intent2;
            if (menuItemArr != null && (i14 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i14] = a10;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i10) {
        return addSubMenu(0, 0, 0, this.f933b.getString(i10));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i10, int i11, int i12, int i13) {
        return addSubMenu(i10, i11, i12, this.f933b.getString(i13));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i10, int i11, int i12, CharSequence charSequence) {
        h a10 = a(i10, i11, i12, charSequence);
        m mVar = new m(this.f932a, this, a10);
        a10.f973o = mVar;
        mVar.setHeaderTitle(a10.f963e);
        return mVar;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public final void b(j jVar, Context context) {
        this.f952u.add(new WeakReference<>(jVar));
        jVar.h(context, this);
        this.f942k = true;
    }

    public final void c(boolean z10) {
        if (this.f950s) {
            return;
        }
        this.f950s = true;
        Iterator<WeakReference<j>> it = this.f952u.iterator();
        while (it.hasNext()) {
            WeakReference<j> next = it.next();
            j jVar = next.get();
            if (jVar == null) {
                this.f952u.remove(next);
            } else {
                jVar.c(this, z10);
            }
        }
        this.f950s = false;
    }

    @Override // android.view.Menu
    public final void clear() {
        h hVar = this.f953v;
        if (hVar != null) {
            d(hVar);
        }
        this.f937f.clear();
        p(true);
    }

    public final void clearHeader() {
        this.f945n = null;
        this.f944m = null;
        this.f946o = null;
        p(false);
    }

    @Override // android.view.Menu
    public final void close() {
        c(true);
    }

    public boolean d(h hVar) {
        boolean z10 = false;
        if (!this.f952u.isEmpty() && this.f953v == hVar) {
            w();
            Iterator<WeakReference<j>> it = this.f952u.iterator();
            while (it.hasNext()) {
                WeakReference<j> next = it.next();
                j jVar = next.get();
                if (jVar == null) {
                    this.f952u.remove(next);
                } else {
                    z10 = jVar.g(hVar);
                    if (z10) {
                        break;
                    }
                }
            }
            v();
            if (z10) {
                this.f953v = null;
            }
        }
        return z10;
    }

    public boolean e(f fVar, MenuItem menuItem) {
        a aVar = this.f936e;
        return aVar != null && aVar.a(fVar, menuItem);
    }

    public boolean f(h hVar) {
        boolean z10 = false;
        if (this.f952u.isEmpty()) {
            return false;
        }
        w();
        Iterator<WeakReference<j>> it = this.f952u.iterator();
        while (it.hasNext()) {
            WeakReference<j> next = it.next();
            j jVar = next.get();
            if (jVar == null) {
                this.f952u.remove(next);
            } else {
                z10 = jVar.m(hVar);
                if (z10) {
                    break;
                }
            }
        }
        v();
        if (z10) {
            this.f953v = hVar;
        }
        return z10;
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i10) {
        MenuItem findItem;
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            h hVar = this.f937f.get(i11);
            if (hVar.f959a == i10) {
                return hVar;
            }
            if (hVar.hasSubMenu() && (findItem = hVar.f973o.findItem(i10)) != null) {
                return findItem;
            }
        }
        return null;
    }

    public final h g(int i10, KeyEvent keyEvent) {
        char c10;
        ArrayList<h> arrayList = this.f951t;
        arrayList.clear();
        h(arrayList, i10, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return arrayList.get(0);
        }
        boolean n10 = n();
        for (int i11 = 0; i11 < size; i11++) {
            h hVar = arrayList.get(i11);
            if (n10) {
                c10 = hVar.f968j;
            } else {
                c10 = hVar.f966h;
            }
            char[] cArr = keyData.meta;
            if ((c10 == cArr[0] && (metaState & 2) == 0) || ((c10 == cArr[2] && (metaState & 2) != 0) || (n10 && c10 == '\b' && i10 == 67))) {
                return hVar;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i10) {
        return this.f937f.get(i10);
    }

    public final void h(ArrayList arrayList, int i10, KeyEvent keyEvent) {
        char c10;
        int i11;
        boolean z10;
        boolean n10 = n();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (!keyEvent.getKeyData(keyData) && i10 != 67) {
            return;
        }
        int size = this.f937f.size();
        for (int i12 = 0; i12 < size; i12++) {
            h hVar = this.f937f.get(i12);
            if (hVar.hasSubMenu()) {
                hVar.f973o.h(arrayList, i10, keyEvent);
            }
            if (n10) {
                c10 = hVar.f968j;
            } else {
                c10 = hVar.f966h;
            }
            if (n10) {
                i11 = hVar.f969k;
            } else {
                i11 = hVar.f967i;
            }
            if ((modifiers & 69647) == (i11 & 69647)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 && c10 != 0) {
                char[] cArr = keyData.meta;
                if ((c10 == cArr[0] || c10 == cArr[2] || (n10 && c10 == '\b' && i10 == 67)) && hVar.isEnabled()) {
                    arrayList.add(hVar);
                }
            }
        }
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        if (this.f955x) {
            return true;
        }
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f937f.get(i10).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public final void i() {
        boolean z10;
        ArrayList<h> arrayList;
        ArrayList<h> l10 = l();
        if (!this.f942k) {
            return;
        }
        Iterator<WeakReference<j>> it = this.f952u.iterator();
        boolean z11 = false;
        while (it.hasNext()) {
            WeakReference<j> next = it.next();
            j jVar = next.get();
            if (jVar == null) {
                this.f952u.remove(next);
            } else {
                z11 |= jVar.e();
            }
        }
        if (z11) {
            this.f940i.clear();
            this.f941j.clear();
            int size = l10.size();
            for (int i10 = 0; i10 < size; i10++) {
                h hVar = l10.get(i10);
                if ((hVar.f982x & 32) == 32) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    arrayList = this.f940i;
                } else {
                    arrayList = this.f941j;
                }
                arrayList.add(hVar);
            }
        } else {
            this.f940i.clear();
            this.f941j.clear();
            this.f941j.addAll(l());
        }
        this.f942k = false;
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i10, KeyEvent keyEvent) {
        return g(i10, keyEvent) != null;
    }

    public String j() {
        return "android:menu:actionviewstates";
    }

    public f k() {
        return this;
    }

    public final ArrayList<h> l() {
        if (this.f939h) {
            this.f938g.clear();
            int size = this.f937f.size();
            for (int i10 = 0; i10 < size; i10++) {
                h hVar = this.f937f.get(i10);
                if (hVar.isVisible()) {
                    this.f938g.add(hVar);
                }
            }
            this.f939h = false;
            this.f942k = true;
            return this.f938g;
        }
        return this.f938g;
    }

    public boolean m() {
        return this.f954w;
    }

    public boolean n() {
        return this.f934c;
    }

    public boolean o() {
        return this.f935d;
    }

    public final void p(boolean z10) {
        if (!this.f947p) {
            if (z10) {
                this.f939h = true;
                this.f942k = true;
            }
            if (!this.f952u.isEmpty()) {
                w();
                Iterator<WeakReference<j>> it = this.f952u.iterator();
                while (it.hasNext()) {
                    WeakReference<j> next = it.next();
                    j jVar = next.get();
                    if (jVar == null) {
                        this.f952u.remove(next);
                    } else {
                        jVar.d(z10);
                    }
                }
                v();
                return;
            }
            return;
        }
        this.f948q = true;
        if (z10) {
            this.f949r = true;
        }
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i10, int i11) {
        return q(findItem(i10), null, i11);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i10, KeyEvent keyEvent, int i11) {
        boolean z10;
        h g10 = g(i10, keyEvent);
        if (g10 != null) {
            z10 = q(g10, null, i11);
        } else {
            z10 = false;
        }
        if ((i11 & 2) != 0) {
            c(true);
        }
        return z10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:118:0x005b, code lost:
        if (r1 != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x006a, code lost:
        if ((r9 & 1) == 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x00c6, code lost:
        if (r1 == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x00c8, code lost:
        c(true);
     */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean q(android.view.MenuItem r7, androidx.appcompat.view.menu.j r8, int r9) {
        /*
            r6 = this;
            androidx.appcompat.view.menu.h r7 = (androidx.appcompat.view.menu.h) r7
            r0 = 0
            if (r7 == 0) goto Lcc
            boolean r1 = r7.isEnabled()
            if (r1 != 0) goto Ld
            goto Lcc
        Ld:
            android.view.MenuItem$OnMenuItemClickListener r1 = r7.f974p
            r2 = 1
            if (r1 == 0) goto L19
            boolean r1 = r1.onMenuItemClick(r7)
            if (r1 == 0) goto L19
            goto L40
        L19:
            androidx.appcompat.view.menu.f r1 = r7.f972n
            boolean r1 = r1.e(r1, r7)
            if (r1 == 0) goto L22
            goto L40
        L22:
            android.content.Intent r1 = r7.f965g
            if (r1 == 0) goto L36
            androidx.appcompat.view.menu.f r3 = r7.f972n     // Catch: android.content.ActivityNotFoundException -> L2e
            android.content.Context r3 = r3.f932a     // Catch: android.content.ActivityNotFoundException -> L2e
            r3.startActivity(r1)     // Catch: android.content.ActivityNotFoundException -> L2e
            goto L40
        L2e:
            r1 = move-exception
            java.lang.String r3 = "MenuItemImpl"
            java.lang.String r4 = "Can't find activity to handle intent; ignoring"
            android.util.Log.e(r3, r4, r1)
        L36:
            k1.b r1 = r7.A
            if (r1 == 0) goto L42
            boolean r1 = r1.e()
            if (r1 == 0) goto L42
        L40:
            r1 = 1
            goto L43
        L42:
            r1 = 0
        L43:
            k1.b r3 = r7.A
            if (r3 == 0) goto L4f
            boolean r4 = r3.a()
            if (r4 == 0) goto L4f
            r4 = 1
            goto L50
        L4f:
            r4 = 0
        L50:
            boolean r5 = r7.e()
            if (r5 == 0) goto L5f
            boolean r7 = r7.expandActionView()
            r1 = r1 | r7
            if (r1 == 0) goto Lcb
            goto Lc8
        L5f:
            boolean r5 = r7.hasSubMenu()
            if (r5 != 0) goto L6d
            if (r4 == 0) goto L68
            goto L6d
        L68:
            r7 = r9 & 1
            if (r7 != 0) goto Lcb
            goto Lc8
        L6d:
            r9 = r9 & 4
            if (r9 != 0) goto L74
            r6.c(r0)
        L74:
            boolean r9 = r7.hasSubMenu()
            if (r9 != 0) goto L88
            androidx.appcompat.view.menu.m r9 = new androidx.appcompat.view.menu.m
            android.content.Context r5 = r6.f932a
            r9.<init>(r5, r6, r7)
            r7.f973o = r9
            java.lang.CharSequence r5 = r7.f963e
            r9.setHeaderTitle(r5)
        L88:
            androidx.appcompat.view.menu.m r7 = r7.f973o
            if (r4 == 0) goto L8f
            r3.f(r7)
        L8f:
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<androidx.appcompat.view.menu.j>> r9 = r6.f952u
            boolean r9 = r9.isEmpty()
            if (r9 == 0) goto L98
            goto Lc5
        L98:
            if (r8 == 0) goto L9e
            boolean r0 = r8.k(r7)
        L9e:
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<androidx.appcompat.view.menu.j>> r8 = r6.f952u
            java.util.Iterator r8 = r8.iterator()
        La4:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto Lc5
            java.lang.Object r9 = r8.next()
            java.lang.ref.WeakReference r9 = (java.lang.ref.WeakReference) r9
            java.lang.Object r3 = r9.get()
            androidx.appcompat.view.menu.j r3 = (androidx.appcompat.view.menu.j) r3
            if (r3 != 0) goto Lbe
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<androidx.appcompat.view.menu.j>> r3 = r6.f952u
            r3.remove(r9)
            goto La4
        Lbe:
            if (r0 != 0) goto La4
            boolean r0 = r3.k(r7)
            goto La4
        Lc5:
            r1 = r1 | r0
            if (r1 != 0) goto Lcb
        Lc8:
            r6.c(r2)
        Lcb:
            return r1
        Lcc:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.f.q(android.view.MenuItem, androidx.appcompat.view.menu.j, int):boolean");
    }

    public final void r(j jVar) {
        Iterator<WeakReference<j>> it = this.f952u.iterator();
        while (it.hasNext()) {
            WeakReference<j> next = it.next();
            j jVar2 = next.get();
            if (jVar2 == null || jVar2 == jVar) {
                this.f952u.remove(next);
            }
        }
    }

    @Override // android.view.Menu
    public final void removeGroup(int i10) {
        int size = size();
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (i12 < size) {
                if (this.f937f.get(i12).f960b == i10) {
                    break;
                }
                i12++;
            } else {
                i12 = -1;
                break;
            }
        }
        if (i12 >= 0) {
            int size2 = this.f937f.size() - i12;
            while (true) {
                int i13 = i11 + 1;
                if (i11 >= size2 || this.f937f.get(i12).f960b != i10) {
                    break;
                }
                if (i12 >= 0 && i12 < this.f937f.size()) {
                    this.f937f.remove(i12);
                }
                i11 = i13;
            }
            p(true);
        }
    }

    @Override // android.view.Menu
    public final void removeItem(int i10) {
        int size = size();
        int i11 = 0;
        while (true) {
            if (i11 < size) {
                if (this.f937f.get(i11).f959a == i10) {
                    break;
                }
                i11++;
            } else {
                i11 = -1;
                break;
            }
        }
        if (i11 >= 0 && i11 < this.f937f.size()) {
            this.f937f.remove(i11);
            p(true);
        }
    }

    public final void s(Bundle bundle) {
        MenuItem findItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(j());
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            MenuItem item = getItem(i10);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((m) item.getSubMenu()).s(bundle);
            }
        }
        int i11 = bundle.getInt("android:menu:expandedactionview");
        if (i11 <= 0 || (findItem = findItem(i11)) == null) {
            return;
        }
        findItem.expandActionView();
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i10, boolean z10, boolean z11) {
        int i11;
        int size = this.f937f.size();
        for (int i12 = 0; i12 < size; i12++) {
            h hVar = this.f937f.get(i12);
            if (hVar.f960b == i10) {
                int i13 = hVar.f982x & (-5);
                if (z11) {
                    i11 = 4;
                } else {
                    i11 = 0;
                }
                hVar.f982x = i13 | i11;
                hVar.setCheckable(z10);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z10) {
        this.f954w = z10;
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i10, boolean z10) {
        int size = this.f937f.size();
        for (int i11 = 0; i11 < size; i11++) {
            h hVar = this.f937f.get(i11);
            if (hVar.f960b == i10) {
                hVar.setEnabled(z10);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i10, boolean z10) {
        int i11;
        boolean z11;
        int size = this.f937f.size();
        boolean z12 = false;
        for (int i12 = 0; i12 < size; i12++) {
            h hVar = this.f937f.get(i12);
            if (hVar.f960b == i10) {
                int i13 = hVar.f982x;
                int i14 = i13 & (-9);
                if (z10) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                int i15 = i14 | i11;
                hVar.f982x = i15;
                if (i13 != i15) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    z12 = true;
                }
            }
        }
        if (z12) {
            p(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z10) {
        this.f934c = z10;
        p(false);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f937f.size();
    }

    public final void t(Bundle bundle) {
        int size = size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i10 = 0; i10 < size; i10++) {
            MenuItem item = getItem(i10);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((m) item.getSubMenu()).t(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(j(), sparseArray);
        }
    }

    public final void u(int i10, CharSequence charSequence, int i11, Drawable drawable, View view) {
        Resources resources = this.f933b;
        if (view != null) {
            this.f946o = view;
            this.f944m = null;
            this.f945n = null;
        } else {
            if (i10 > 0) {
                this.f944m = resources.getText(i10);
            } else if (charSequence != null) {
                this.f944m = charSequence;
            }
            if (i11 > 0) {
                Context context = this.f932a;
                Object obj = y0.a.f30807a;
                this.f945n = a.c.b(context, i11);
            } else if (drawable != null) {
                this.f945n = drawable;
            }
            this.f946o = null;
        }
        p(false);
    }

    public final void v() {
        this.f947p = false;
        if (this.f948q) {
            this.f948q = false;
            p(this.f949r);
        }
    }

    public final void w() {
        if (this.f947p) {
            return;
        }
        this.f947p = true;
        this.f948q = false;
        this.f949r = false;
    }
}
