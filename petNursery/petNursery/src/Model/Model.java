package Model;

import Model.Animal.Service.ICatService;
import Model.Animal.Service.IDogService;

public class Model {
    private IDogService iDogService;
    private ICatService iCatService;

    public Model(IDogService iDogService, ICatService iCatService) {
        this.iDogService = iDogService;
        this.iCatService = iCatService;
    }

    public IDogService getIDogService() {
        return iDogService;
    }

    public ICatService getICatService() {
        return iCatService;
    }

    public void setIDogService(IDogService iDogService) {
        this.iDogService = iDogService;
    }

    public void setICatService(ICatService iCatService) {
        this.iCatService = iCatService;
    }
}
