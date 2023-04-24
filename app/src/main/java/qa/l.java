package qa;

import java.io.IOException;
import java.io.StringWriter;

/* loaded from: classes.dex */
public abstract class l {
    public final q b() {
        if (this instanceof q) {
            return (q) this;
        }
        throw new IllegalStateException("Not a JSON Primitive: " + this);
    }

    public final String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            ya.b bVar = new ya.b(stringWriter);
            bVar.f31269e = true;
            ta.r.f27940z.b(bVar, this);
            return stringWriter.toString();
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }
}
