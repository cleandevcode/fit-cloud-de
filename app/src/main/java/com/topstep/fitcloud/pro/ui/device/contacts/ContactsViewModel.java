package com.topstep.fitcloud.pro.ui.device.contacts;

import bi.z0;
import kotlin.Metadata;
import nh.f;
import og.t;
import pm.e0;
import qi.s;
import tl.l;
import vh.c;
import vh.e;
import vh.h;
import xl.d;

@Metadata
/* loaded from: classes2.dex */
public final class ContactsViewModel extends f<e, c> {

    /* renamed from: h */
    public final t f10903h;

    /* renamed from: i */
    public final a f10904i;

    /* loaded from: classes2.dex */
    public static final class a extends s<l> {

        @zl.e(c = "com.topstep.fitcloud.pro.ui.device.contacts.ContactsViewModel$setContactsAction$1", f = "ContactsViewModel.kt", l = {114}, m = "action")
        /* renamed from: com.topstep.fitcloud.pro.ui.device.contacts.ContactsViewModel$a$a */
        /* loaded from: classes2.dex */
        public static final class C0161a extends zl.c {

            /* renamed from: d */
            public /* synthetic */ Object f10906d;

            /* renamed from: f */
            public int f10908f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0161a(d<? super C0161a> dVar) {
                super(dVar);
                a.this = r1;
            }

            @Override // zl.a
            public final Object t(Object obj) {
                this.f10906d = obj;
                this.f10908f |= Integer.MIN_VALUE;
                return a.this.a(this);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(e0 e0Var) {
            super(e0Var);
            ContactsViewModel.this = r1;
        }

        /* JADX WARN: Removed duplicated region for block: B:66:0x0025  */
        /* JADX WARN: Removed duplicated region for block: B:70:0x0034  */
        @Override // qi.s
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object a(xl.d<? super tl.l> r18) {
            /*
                Method dump skipped, instructions count: 366
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.topstep.fitcloud.pro.ui.device.contacts.ContactsViewModel.a.a(xl.d):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContactsViewModel(t tVar) {
        super(new e(0));
        gm.l.f(tVar, "deviceManager");
        this.f10903h = tVar;
        z0.g(rm.l.h(this), null, 0, new h(this, null), 3);
        this.f10904i = new a(rm.l.h(this));
    }
}
