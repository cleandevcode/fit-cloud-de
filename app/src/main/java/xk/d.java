package xk;

import il.l;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class d implements uk.c, uk.d {

    /* renamed from: a */
    public LinkedList f30618a;

    /* renamed from: b */
    public volatile boolean f30619b;

    @Override // uk.d
    public final boolean a(uk.c cVar) {
        if (d(cVar)) {
            ((l) cVar).c();
            return true;
        }
        return false;
    }

    @Override // uk.d
    public final boolean b(uk.c cVar) {
        if (!this.f30619b) {
            synchronized (this) {
                if (!this.f30619b) {
                    LinkedList linkedList = this.f30618a;
                    if (linkedList == null) {
                        linkedList = new LinkedList();
                        this.f30618a = linkedList;
                    }
                    linkedList.add(cVar);
                    return true;
                }
            }
        }
        cVar.c();
        return false;
    }

    @Override // uk.c
    public final void c() {
        if (this.f30619b) {
            return;
        }
        synchronized (this) {
            if (this.f30619b) {
                return;
            }
            this.f30619b = true;
            LinkedList<uk.c> linkedList = this.f30618a;
            ArrayList arrayList = null;
            this.f30618a = null;
            if (linkedList != null) {
                for (uk.c cVar : linkedList) {
                    try {
                        cVar.c();
                    } catch (Throwable th2) {
                        h7.a.y(th2);
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(th2);
                    }
                }
                if (arrayList != null) {
                    if (arrayList.size() == 1) {
                        throw kl.d.d((Throwable) arrayList.get(0));
                    }
                    throw new vk.a(arrayList);
                }
            }
        }
    }

    @Override // uk.d
    public final boolean d(uk.c cVar) {
        Objects.requireNonNull(cVar, "Disposable item is null");
        if (this.f30619b) {
            return false;
        }
        synchronized (this) {
            if (this.f30619b) {
                return false;
            }
            LinkedList linkedList = this.f30618a;
            if (linkedList != null && linkedList.remove(cVar)) {
                return true;
            }
            return false;
        }
    }
}
