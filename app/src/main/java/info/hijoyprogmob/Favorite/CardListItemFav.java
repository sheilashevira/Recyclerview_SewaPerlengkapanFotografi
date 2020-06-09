package info.hijoyprogmob.Favorite;

public class CardListItemFav {
    private int mImageResourceFav;
    private String mProdukFav;
    private String mDescFav;

    public CardListItemFav(int imageResourceFav, String produkFav, String descFav){
        mImageResourceFav = imageResourceFav;
        mProdukFav = produkFav;
        mDescFav = descFav;
    }

    public int getImageResource(){
        return mImageResourceFav;
    }

    public String getmProdukFav(){
        return mProdukFav;
    }

    public String getmDesFav(){
        return mDescFav;
    }
}
