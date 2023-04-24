package vl;

import androidx.appcompat.widget.u0;
import gm.l;
import java.io.Externalizable;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Map;
import ul.t;

/* loaded from: classes2.dex */
public final class g implements Externalizable {

    /* renamed from: a */
    public Map<?, ?> f29469a;

    public g() {
        this(t.f28880a);
    }

    public g(Map<?, ?> map) {
        l.f(map, "map");
        this.f29469a = map;
    }

    private final Object readResolve() {
        return this.f29469a;
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) {
        l.f(objectInput, "input");
        byte readByte = objectInput.readByte();
        if (readByte == 0) {
            int readInt = objectInput.readInt();
            if (readInt >= 0) {
                b bVar = new b(readInt);
                for (int i10 = 0; i10 < readInt; i10++) {
                    bVar.put(objectInput.readObject(), objectInput.readObject());
                }
                bVar.c();
                bVar.f29458l = true;
                this.f29469a = bVar;
                return;
            }
            throw new InvalidObjectException("Illegal size value: " + readInt + '.');
        }
        throw new InvalidObjectException(u0.a("Unsupported flags value: ", readByte));
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) {
        l.f(objectOutput, "output");
        objectOutput.writeByte(0);
        objectOutput.writeInt(this.f29469a.size());
        for (Map.Entry<?, ?> entry : this.f29469a.entrySet()) {
            objectOutput.writeObject(entry.getKey());
            objectOutput.writeObject(entry.getValue());
        }
    }
}
