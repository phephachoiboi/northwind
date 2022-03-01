package fi.vamk.e2000593.northwind.entity;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;

//import java.sql.*;
import javax.persistence.*;
import javax.persistence.criteria.Order;

import com.fasterxml.jackson.annotation.JsonIgnore;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;

import fi.vamk.e2000593.northwind.repository.CustomerRepository;
import lombok.Data;

@Data
@Entity(name = "fi.vamk.e200593.northwind.entity.Customers")
@Table(name = "customers")
public class Customers implements CustomerRepository {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "\"id\"", nullable = false)
  private Integer id;
  @Column(name = "\"company\"", nullable = true)
  private String company;
  @Column(name = "\"last_name\"", nullable = true)
  private String lastName;
  @Column(name = "\"first_name\"", nullable = true)
  private String firstName;
  @Column(name = "\"email_address\"", nullable = true)
  private String emailAddress;
  @Column(name = "\"job_title\"", nullable = true)
  private String jobTitle;
  @Column(name = "\"business_phone\"", nullable = true)
  private String businessPhone;
  @Column(name = "\"home_phone\"", nullable = true)
  private String homePhone;
  @Column(name = "\"mobile_phone\"", nullable = true)
  private String mobilePhone;
  @Column(name = "\"fax_number\"", nullable = true)
  private String faxNumber;
  @Column(name = "\"address\"", nullable = true)
  private String address;
  @Column(name = "\"city\"", nullable = true)
  private String city;
  @Column(name = "\"state_province\"", nullable = true)
  private String stateProvince;
  @Column(name = "\"zip_postal_code\"", nullable = true)
  private String zipPostalCode;
  @Column(name = "\"country_region\"", nullable = true)
  private String countryRegion;
  @Column(name = "\"web_page\"", nullable = true)
  private String webPage;
  @Column(name = "\"notes\"", nullable = true)
  private String notes;
  @Column(name = "\"attachments\"", nullable = true)
  private String attachments;
  @JsonIgnore
    @OneToMany(mappedBy = "customer")
    private Set<Order> orders = new LinkedHashSet<>();
  @Override
  public void deleteAllByIdInBatch(Iterable<Integer> ids) {
    // TODO Auto-generated method stub
    
  }
  @Override
  public void deleteAllInBatch() {
    // TODO Auto-generated method stub
    
  }
  @Override
  public void deleteAllInBatch(Iterable<CustomerRepository> entities) {
    // TODO Auto-generated method stub
    
  }
  @Override
  public List<CustomerRepository> findAll() {
    // TODO Auto-generated method stub
    return null;
  }
  @Override
  public List<CustomerRepository> findAll(Sort sort) {
    // TODO Auto-generated method stub
    return null;
  }
  @Override
  public <S extends CustomerRepository> List<S> findAll(Example<S> example) {
    // TODO Auto-generated method stub
    return null;
  }
  @Override
  public <S extends CustomerRepository> List<S> findAll(Example<S> example, Sort sort) {
    // TODO Auto-generated method stub
    return null;
  }
  @Override
  public List<CustomerRepository> findAllById(Iterable<Integer> ids) {
    // TODO Auto-generated method stub
    return null;
  }
  @Override
  public void flush() {
    // TODO Auto-generated method stub
    
  }
  @Override
  public CustomerRepository getById(Integer id) {
    // TODO Auto-generated method stub
    return null;
  }
  @Override
  public CustomerRepository getOne(Integer id) {
    // TODO Auto-generated method stub
    return null;
  }
  @Override
  public <S extends CustomerRepository> List<S> saveAll(Iterable<S> entities) {
    // TODO Auto-generated method stub
    return null;
  }
  @Override
  public <S extends CustomerRepository> List<S> saveAllAndFlush(Iterable<S> entities) {
    // TODO Auto-generated method stub
    return null;
  }
  @Override
  public <S extends CustomerRepository> S saveAndFlush(S entity) {
    // TODO Auto-generated method stub
    return null;
  }
  @Override
  public Page<CustomerRepository> findAll(Pageable pageable) {
    // TODO Auto-generated method stub
    return null;
  }
  @Override
  public long count() {
    // TODO Auto-generated method stub
    return 0;
  }
  @Override
  public void delete(CustomerRepository entity) {
    // TODO Auto-generated method stub
    
  }
  @Override
  public void deleteAll() {
    // TODO Auto-generated method stub
    
  }
  @Override
  public void deleteAll(Iterable<? extends CustomerRepository> entities) {
    // TODO Auto-generated method stub
    
  }
  @Override
  public void deleteAllById(Iterable<? extends Integer> ids) {
    // TODO Auto-generated method stub
    
  }
  @Override
  public void deleteById(Integer id) {
    // TODO Auto-generated method stub
    
  }
  @Override
  public boolean existsById(Integer id) {
    // TODO Auto-generated method stub
    return false;
  }
  @Override
  public Optional<CustomerRepository> findById(Integer id) {
    // TODO Auto-generated method stub
    return null;
  }
  @Override
  public <S extends CustomerRepository> S save(S entity) {
    // TODO Auto-generated method stub
    return null;
  }
  @Override
  public <S extends CustomerRepository> long count(Example<S> example) {
    // TODO Auto-generated method stub
    return 0;
  }
  @Override
  public <S extends CustomerRepository> boolean exists(Example<S> example) {
    // TODO Auto-generated method stub
    return false;
  }
  @Override
  public <S extends CustomerRepository> Page<S> findAll(Example<S> example, Pageable pageable) {
    // TODO Auto-generated method stub
    return null;
  }
  @Override
  public <S extends CustomerRepository, R> R findBy(Example<S> example,
      Function<FetchableFluentQuery<S>, R> queryFunction) {
    // TODO Auto-generated method stub
    return null;
  }
  @Override
  public <S extends CustomerRepository> Optional<S> findOne(Example<S> example) {
    // TODO Auto-generated method stub
    return null;
  }
  @Override
  public Customers save(Customers customer) {
    // TODO Auto-generated method stub
    return null;
  }
  @Override
  public void delete(Customers customer) {
    // TODO Auto-generated method stub
    
  }

  
  public Customers(){

  }

  public Integer getId(){
    return id;
  }
  public void setId(Integer id){
    this.id = id;
  }

  public String getCompany(){
    return company;
  }
  public void setCompany(String company){
    this.company = company;
  }

  public String getLastName(){
    return lastName;
  }
  public void setLastName(String lastName){
    this.lastName= lastName;
  }

  public String getFirstName(){
    return firstName;
  }
  public void setFirstName(String firstName){
    this.firstName = firstName;
  }

  public String getEmailAddress(){
    return emailAddress;
  }
  public void setEmailAddres(String emailAddress){
    this.emailAddress = emailAddress;
  }

  public String getJobTitle(){
    return jobTitle;
  }
  public void setJobTitle(String jobTitle){
    this.jobTitle = jobTitle;
  }

  public String getBusinessPhone(){
    return businessPhone;
  }
  public void setBusinessPhone(String businessPhone){
    this.businessPhone = businessPhone;
  }

  public String getHomePhone(){
    return homePhone;
  }
  public void setHomePhone(String homePhone){
    this.homePhone = homePhone;
  }

  public String getMobilePhone(){
    return mobilePhone;
  }
  public void setMobilePhone(String mobilePhone){
    this.mobilePhone = mobilePhone;
  }

  public String getFaxNumber(){
    return faxNumber;
  }
  public void setFaxNumber(String faxNumber){
    this.faxNumber = faxNumber;
  }

  public String getAddress(){
    return address;
  }
  public void setAddress(String address){
    this.address = address;
  }

  public String getCity(){
    return city;
  }
  public void setCity(String city){
    this.city = city;
  }

  public String getStateProvince(){
    return stateProvince;
  }
  public void setStateProvince(String stateProvince){
    this.stateProvince = stateProvince;
  }

  public String getZipPostalCode(){
    return zipPostalCode;
  }
  public void setZipPostalCode(String zipPostalCode){
    this.zipPostalCode = zipPostalCode;
  }

  public String getCountryRegion(){
    return countryRegion;
  }
  public void setCountryRegion(String countryRegion){
    this.countryRegion = countryRegion;
  }

  public String getWebPage(){
    return webPage;
  }
  public void setWebPage(String webPage){
    this.webPage = webPage;
  }

  public String getNotes(){
    return notes;
  }
  public void setNotes(String notes){
    this.notes = notes;
  }

  public String getAttachments(){
    return attachments;
  }
  public void setAttachments(String attachments){
    this.attachments = attachments;
  }


}

