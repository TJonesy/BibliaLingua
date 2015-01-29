package es.tjon.bl.data.catalog;

import com.mobandme.ada.*;
import com.mobandme.ada.annotations.*;
import es.tjon.bl.data.*;
import es.tjon.bl.database.*;

@Table(name="Book")
public class Book extends Entity implements CatalogItem
{

	@Override
	public String getCoverURL()
	{
		return cover_art;
	}


	@Override
	public String getName()
	{
		return name;
	}

	@Override
	public int getId()
	{
		return id;
	}
	
	@TableField(name="b_id",datatype=DATATYPE_INTEGER)
	public int id = -1;
	@TableField(name="b_cb_id",datatype=DATATYPE_INTEGER)
	public int cb_id = -1;
	@TableField(name="b_name",datatype=DATATYPE_TEXT)
	public String name = null;
	@TableField(name="b_full_name",datatype=DATATYPE_TEXT)
	public String full_name = null;
	@TableField(name="b_description",datatype=DATATYPE_TEXT)
	public String description = null;
	@TableField(name="b_gl_uri",datatype=DATATYPE_TEXT)
	public String gl_uri = null;
	@TableField(name="b_url",datatype=DATATYPE_TEXT)
	public String url = null;
	@TableField(name="b_display_order",datatype=DATATYPE_INTEGER)
	public int display_order = -1;
	@TableField(name="b_version",datatype=DATATYPE_INTEGER)
	public int version = -1;
	@TableField(name="b_file_version",datatype=DATATYPE_INTEGER)
	public int file_version = -1;
	@TableField(name="b_file",datatype=DATATYPE_TEXT)
	public String file = null;
	@TableField(name="b_size",datatype=DATATYPE_INTEGER)
	public int size = -1;
	@TableField(name="b_dateadded",datatype=DATATYPE_TEXT)
	public String dateadded = null;
	@TableField(name="b_datemodified",datatype=DATATYPE_TEXT)
	public String datemodified = null;
	@TableField(name="b_media_available",datatype=DATATYPE_INTEGER)
	public int media_available = -1;
	@TableField(name="b_size_index",datatype=DATATYPE_INTEGER)
	public int size_index = -1;
	@TableField(name="b_language",datatype=DATATYPE_ENTITY_LINK)
	public Language language = null;
	@TableField(name="b_catalog",datatype=DATATYPE_ENTITY_LINK)
	public Catalog catalog;
	@TableField(name="b_cover_art",datatype=DATATYPE_TEXT)
	public String cover_art;
	@TableField(name="b_folder",datatype=DATATYPE_ENTITY_LINK)
	public Folder folder=null;

	public void setup(ApplicationDataContext adc)
	{
	}


	public void update(Book book, ApplicationDataContext adc)
	{
		cb_id=book.cb_id;
		name=book.name;
		full_name=book.full_name;
		description=book.description;
		gl_uri=book.gl_uri;
		url=book.url;
		display_order=book.display_order;
		version=book.version;
		file_version=book.file_version;
		file=book.file;
		size=book.size;
		dateadded=book.dateadded;
		datemodified=book.datemodified;
		media_available=book.media_available;
		size_index=book.size_index;
		cover_art=book.cover_art;
		
	}
}