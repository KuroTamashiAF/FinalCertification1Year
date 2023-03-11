package Model;

import Model.Animal.Iadditional;
import Model.Animal.Service.ICatService;
import Model.Animal.Service.IDogService;

public class Model implements Iadditional {
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

    @Override
    public void lookAll() {
        iDogService.showAllDog();
        iCatService.showAllKitty();
    }
}
