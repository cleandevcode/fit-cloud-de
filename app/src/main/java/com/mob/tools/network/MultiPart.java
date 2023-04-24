package com.mob.tools.network;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class MultiPart extends HTTPPart {

    /* renamed from: a */
    private ArrayList<HTTPPart> f9123a = new ArrayList<>();

    @Override // com.mob.tools.network.HTTPPart
    public InputStream a() {
        MultiPartInputStream multiPartInputStream = new MultiPartInputStream();
        Iterator<HTTPPart> it = this.f9123a.iterator();
        while (it.hasNext()) {
            multiPartInputStream.addInputStream(it.next().a());
        }
        return multiPartInputStream;
    }

    public MultiPart append(HTTPPart hTTPPart) {
        this.f9123a.add(hTTPPart);
        return this;
    }

    @Override // com.mob.tools.network.HTTPPart
    public long b() {
        Iterator<HTTPPart> it = this.f9123a.iterator();
        long j10 = 0;
        while (it.hasNext()) {
            j10 += it.next().b();
        }
        return j10;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        Iterator<HTTPPart> it = this.f9123a.iterator();
        while (it.hasNext()) {
            sb2.append(it.next().toString());
        }
        return sb2.toString();
    }
}
