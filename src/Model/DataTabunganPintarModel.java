package Model;
import Entity.DataTabunganPintarEntity;
import java.util.ArrayList;
public class DataTabunganPintarModel {
    protected ArrayList<DataTabunganPintarEntity> datatabunganpintarEntityArrayList;
    public DataTabunganPintarModel() {
        datatabunganpintarEntityArrayList= new ArrayList<DataTabunganPintarEntity>();
    }
    public void InsertDataTabunganPintar(DataTabunganPintarEntity dataTabunganPintarEntity){
        datatabunganpintarEntityArrayList.add(dataTabunganPintarEntity);
    }
}
