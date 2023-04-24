package z3;

/* loaded from: classes.dex */
public final class d extends IllegalStateException {
    public d(Throwable th2) {
        super("NavController is not always accessible before onViewCreated.\n\nDuring device re-configuration or launch after process death the NavController is not accessible and thus any\nNav Graph ViewModel is also not accessible. You will need to moving any ViewModel access to onViewCreated or later \nin the fragment views lifecycle to ensure the ViewModel can be accessed. ", th2);
    }
}
