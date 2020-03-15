package factory;

import enums.Researcher;
import interfaces.IResearcher;
import researchers.btv.BtvResearcher;
import researchers.nova.NovaResearcher;

public class ResearcherFactory {
    public IResearcher getResearcher(Researcher researcher) {
        if (researcher == null) {
            return null;
        }

        if (researcher.equals(Researcher.BtvResearcher)) {
            return new BtvResearcher();
        } else if (researcher.equals(Researcher.NovaResearcher)) {
            return new NovaResearcher();
        }
        return null;
    }
}
