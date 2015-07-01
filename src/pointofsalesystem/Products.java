/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pointofsalesystem; 

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Daniel 
 */ 
@Entity
@Table(name = "PRODUCTS", catalog = "", schema = "NBUSER") 
@NamedQueries(
{
    @NamedQuery(name = "Products.findAll", query = "SELECT p FROM Products p"),
    @NamedQuery(name = "Products.findByProductId", query = "SELECT p FROM Products p WHERE p.productId = :productId"),
    @NamedQuery(name = "Products.findByProductName", query = "SELECT p FROM Products p WHERE p.productName = :productName"),
    @NamedQuery(name = "Products.findByProductBarcode", query = "SELECT p FROM Products p WHERE p.productBarcode = :productBarcode"),
    @NamedQuery(name = "Products.findByProductCostprice", query = "SELECT p FROM Products p WHERE p.productCostprice = :productCostprice"),
    @NamedQuery(name = "Products.findByProductMarkup", query = "SELECT p FROM Products p WHERE p.productMarkup = :productMarkup"),
    @NamedQuery(name = "Products.findByProductQty", query = "SELECT p FROM Products p WHERE p.productQty = :productQty"),
    @NamedQuery(name = "Products.findBySupplierId", query = "SELECT p FROM Products p WHERE p.supplierId = :supplierId")
})
 public class Products implements Serializable 
 {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "PRODUCT_ID")
    private Integer productId;
    @Column(name = "PRODUCT_NAME")
    private String productName;
    @Column(name = "PRODUCT_BARCODE")
    private String productBarcode;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "PRODUCT_COSTPRICE")
    private Float productCostprice;
    @Column(name = "PRODUCT_MARKUP")
    private Float productMarkup;
    @Column(name = "PRODUCT_QTY")
    private Integer productQty;
    @Column(name = "SUPPLIER_ID")
    private Integer supplierId;

    public Products()
    {
    }

    public Products(Integer productId)
    {
        this.productId = productId;
    }

    public Integer getProductId()
    {
        return productId;
    }

    public void setProductId(Integer productId)
    {
        Integer oldProductId = this.productId;
        this.productId = productId;
        changeSupport.firePropertyChange("productId", oldProductId, productId);
    }

    public String getProductName()
    {
        return productName;
    }

    public void setProductName(String productName)
    {
        String oldProductName = this.productName;
        this.productName = productName;
        changeSupport.firePropertyChange("productName", oldProductName, productName);
    }

    public String getProductBarcode()
    {
        return productBarcode;
    }

    public void setProductBarcode(String productBarcode)
    {
        String oldProductBarcode = this.productBarcode;
        this.productBarcode = productBarcode;
        changeSupport.firePropertyChange("productBarcode", oldProductBarcode, productBarcode);
    }

    public Float getProductCostprice()
    {
        return productCostprice;
    }

    public void setProductCostprice(Float productCostprice)
    {
        Float oldProductCostprice = this.productCostprice;
        this.productCostprice = productCostprice;
        changeSupport.firePropertyChange("productCostprice", oldProductCostprice, productCostprice);
    }

    public Float getProductMarkup()
    {
        return productMarkup;
    }

    public void setProductMarkup(Float productMarkup)
    {
        Float oldProductMarkup = this.productMarkup;
        this.productMarkup = productMarkup;
        changeSupport.firePropertyChange("productMarkup", oldProductMarkup, productMarkup);
    }

    public Integer getProductQty()
    {
        return productQty;
    }

    public void setProductQty(Integer productQty)
    {
        Integer oldProductQty = this.productQty;
        this.productQty = productQty;
        changeSupport.firePropertyChange("productQty", oldProductQty, productQty);
    }

    public Integer getSupplierId()
    {
        return supplierId;
    }

    public void setSupplierId(Integer supplierId)
    {
        Integer oldSupplierId = this.supplierId;
        this.supplierId = supplierId;
        changeSupport.firePropertyChange("supplierId", oldSupplierId, supplierId);
    }

    @Override
    public int hashCode()
    {
        int hash = 0;
        hash += (productId != null ? productId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object)
    {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Products))
        {
            return false;
        }
        Products other = (Products) object;
        if ((this.productId == null && other.productId != null) || (this.productId != null && !this.productId.equals(other.productId)))
        {
            return false;
        }
        return true;
    }

    @Override
    public String toString()
    {
        return "pointofsalesystem.Products[ productId=" + productId + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener)
    {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener)
    {
        changeSupport.removePropertyChangeListener(listener);
    }

 }