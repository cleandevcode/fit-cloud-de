package vl;

import bi.z0;
import gm.l;
import java.io.Externalizable;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Collection;
import java.util.Iterator;
import ul.s;

/* loaded from: classes2.dex */
public final class f implements Externalizable {

    /* renamed from: a */
    public Collection<?> f29467a;

    /* renamed from: b */
    public final int f29468b;

    public f() {
        this(0, s.f28879a);
    }

    public f(int i10, Collection collection) {
        l.f(collection, "collection");
        this.f29467a = collection;
        this.f29468b = i10;
    }

    private final Object readResolve() {
        return this.f29467a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) {
        a aVar;
        l.f(objectInput, "input");
        byte readByte = objectInput.readByte();
        int i10 = readByte & 1;
        if ((readByte & (-2)) == 0) {
            int readInt = objectInput.readInt();
            if (readInt >= 0) {
                int i11 = 0;
                if (i10 != 0) {
                    if (i10 == 1) {
                        h hVar = new h(new b(readInt));
                        while (i11 < readInt) {
                            hVar.add(objectInput.readObject());
                            i11++;
                        }
                        z0.c(hVar);
                        aVar = hVar;
                    } else {
                        throw new InvalidObjectException("Unsupported collection type tag: " + i10 + '.');
                    }
                } else {
                    a aVar2 = new a(readInt);
                    while (i11 < readInt) {
                        aVar2.add(objectInput.readObject());
                        i11++;
                    }
                    h7.a.g(aVar2);
                    aVar = aVar2;
                }
                this.f29467a = aVar;
                return;
            }
            throw new InvalidObjectException("Illegal size value: " + readInt + '.');
        }
        throw new InvalidObjectException("Unsupported flags value: " + ((int) readByte) + '.');
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) {
        l.f(objectOutput, "output");
        objectOutput.writeByte(this.f29468b);
        objectOutput.writeInt(this.f29467a.size());
        Iterator<?> it = this.f29467a.iterator();
        while (it.hasNext()) {
            objectOutput.writeObject(it.next());
        }
    }
}
