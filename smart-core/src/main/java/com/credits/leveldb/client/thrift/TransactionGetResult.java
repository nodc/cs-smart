/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.credits.leveldb.client.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.11.0)", date = "2018-07-13")
public class TransactionGetResult implements org.apache.thrift.TBase<TransactionGetResult, TransactionGetResult._Fields>, java.io.Serializable, Cloneable, Comparable<TransactionGetResult> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TransactionGetResult");

  private static final org.apache.thrift.protocol.TField STATUS_FIELD_DESC = new org.apache.thrift.protocol.TField("status", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField FOUND_FIELD_DESC = new org.apache.thrift.protocol.TField("found", org.apache.thrift.protocol.TType.BOOL, (short)2);
  private static final org.apache.thrift.protocol.TField TRANSACTION_FIELD_DESC = new org.apache.thrift.protocol.TField("transaction", org.apache.thrift.protocol.TType.STRUCT, (short)3);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TransactionGetResultStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TransactionGetResultTupleSchemeFactory();

  public APIResponse status; // required
  public boolean found; // required
  public Transaction transaction; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    STATUS((short)1, "status"),
    FOUND((short)2, "found"),
    TRANSACTION((short)3, "transaction");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // STATUS
          return STATUS;
        case 2: // FOUND
          return FOUND;
        case 3: // TRANSACTION
          return TRANSACTION;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __FOUND_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.STATUS, new org.apache.thrift.meta_data.FieldMetaData("status", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, APIResponse.class)));
    tmpMap.put(_Fields.FOUND, new org.apache.thrift.meta_data.FieldMetaData("found", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.TRANSACTION, new org.apache.thrift.meta_data.FieldMetaData("transaction", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, Transaction.class)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TransactionGetResult.class, metaDataMap);
  }

  public TransactionGetResult() {
  }

  public TransactionGetResult(
    APIResponse status,
    boolean found,
    Transaction transaction)
  {
    this();
    this.status = status;
    this.found = found;
    setFoundIsSet(true);
    this.transaction = transaction;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TransactionGetResult(TransactionGetResult other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetStatus()) {
      this.status = new APIResponse(other.status);
    }
    this.found = other.found;
    if (other.isSetTransaction()) {
      this.transaction = new Transaction(other.transaction);
    }
  }

  public TransactionGetResult deepCopy() {
    return new TransactionGetResult(this);
  }

  @Override
  public void clear() {
    this.status = null;
    setFoundIsSet(false);
    this.found = false;
    this.transaction = null;
  }

  public APIResponse getStatus() {
    return this.status;
  }

  public TransactionGetResult setStatus(APIResponse status) {
    this.status = status;
    return this;
  }

  public void unsetStatus() {
    this.status = null;
  }

  /** Returns true if field status is set (has been assigned a value) and false otherwise */
  public boolean isSetStatus() {
    return this.status != null;
  }

  public void setStatusIsSet(boolean value) {
    if (!value) {
      this.status = null;
    }
  }

  public boolean isFound() {
    return this.found;
  }

  public TransactionGetResult setFound(boolean found) {
    this.found = found;
    setFoundIsSet(true);
    return this;
  }

  public void unsetFound() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __FOUND_ISSET_ID);
  }

  /** Returns true if field found is set (has been assigned a value) and false otherwise */
  public boolean isSetFound() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __FOUND_ISSET_ID);
  }

  public void setFoundIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __FOUND_ISSET_ID, value);
  }

  public Transaction getTransaction() {
    return this.transaction;
  }

  public TransactionGetResult setTransaction(Transaction transaction) {
    this.transaction = transaction;
    return this;
  }

  public void unsetTransaction() {
    this.transaction = null;
  }

  /** Returns true if field transaction is set (has been assigned a value) and false otherwise */
  public boolean isSetTransaction() {
    return this.transaction != null;
  }

  public void setTransactionIsSet(boolean value) {
    if (!value) {
      this.transaction = null;
    }
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case STATUS:
      if (value == null) {
        unsetStatus();
      } else {
        setStatus((APIResponse)value);
      }
      break;

    case FOUND:
      if (value == null) {
        unsetFound();
      } else {
        setFound((java.lang.Boolean)value);
      }
      break;

    case TRANSACTION:
      if (value == null) {
        unsetTransaction();
      } else {
        setTransaction((Transaction)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case STATUS:
      return getStatus();

    case FOUND:
      return isFound();

    case TRANSACTION:
      return getTransaction();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case STATUS:
      return isSetStatus();
    case FOUND:
      return isSetFound();
    case TRANSACTION:
      return isSetTransaction();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof TransactionGetResult)
      return this.equals((TransactionGetResult)that);
    return false;
  }

  public boolean equals(TransactionGetResult that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_status = true && this.isSetStatus();
    boolean that_present_status = true && that.isSetStatus();
    if (this_present_status || that_present_status) {
      if (!(this_present_status && that_present_status))
        return false;
      if (!this.status.equals(that.status))
        return false;
    }

    boolean this_present_found = true;
    boolean that_present_found = true;
    if (this_present_found || that_present_found) {
      if (!(this_present_found && that_present_found))
        return false;
      if (this.found != that.found)
        return false;
    }

    boolean this_present_transaction = true && this.isSetTransaction();
    boolean that_present_transaction = true && that.isSetTransaction();
    if (this_present_transaction || that_present_transaction) {
      if (!(this_present_transaction && that_present_transaction))
        return false;
      if (!this.transaction.equals(that.transaction))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetStatus()) ? 131071 : 524287);
    if (isSetStatus())
      hashCode = hashCode * 8191 + status.hashCode();

    hashCode = hashCode * 8191 + ((found) ? 131071 : 524287);

    hashCode = hashCode * 8191 + ((isSetTransaction()) ? 131071 : 524287);
    if (isSetTransaction())
      hashCode = hashCode * 8191 + transaction.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(TransactionGetResult other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetStatus()).compareTo(other.isSetStatus());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStatus()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.status, other.status);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetFound()).compareTo(other.isSetFound());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFound()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.found, other.found);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetTransaction()).compareTo(other.isSetTransaction());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTransaction()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.transaction, other.transaction);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TransactionGetResult(");
    boolean first = true;

    sb.append("status:");
    if (this.status == null) {
      sb.append("null");
    } else {
      sb.append(this.status);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("found:");
    sb.append(this.found);
    first = false;
    if (!first) sb.append(", ");
    sb.append("transaction:");
    if (this.transaction == null) {
      sb.append("null");
    } else {
      sb.append(this.transaction);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (status != null) {
      status.validate();
    }
    if (transaction != null) {
      transaction.validate();
    }
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TransactionGetResultStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TransactionGetResultStandardScheme getScheme() {
      return new TransactionGetResultStandardScheme();
    }
  }

  private static class TransactionGetResultStandardScheme extends org.apache.thrift.scheme.StandardScheme<TransactionGetResult> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TransactionGetResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // STATUS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.status = new APIResponse();
              struct.status.read(iprot);
              struct.setStatusIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // FOUND
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.found = iprot.readBool();
              struct.setFoundIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // TRANSACTION
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.transaction = new Transaction();
              struct.transaction.read(iprot);
              struct.setTransactionIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, TransactionGetResult struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.status != null) {
        oprot.writeFieldBegin(STATUS_FIELD_DESC);
        struct.status.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(FOUND_FIELD_DESC);
      oprot.writeBool(struct.found);
      oprot.writeFieldEnd();
      if (struct.transaction != null) {
        oprot.writeFieldBegin(TRANSACTION_FIELD_DESC);
        struct.transaction.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TransactionGetResultTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TransactionGetResultTupleScheme getScheme() {
      return new TransactionGetResultTupleScheme();
    }
  }

  private static class TransactionGetResultTupleScheme extends org.apache.thrift.scheme.TupleScheme<TransactionGetResult> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TransactionGetResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetStatus()) {
        optionals.set(0);
      }
      if (struct.isSetFound()) {
        optionals.set(1);
      }
      if (struct.isSetTransaction()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetStatus()) {
        struct.status.write(oprot);
      }
      if (struct.isSetFound()) {
        oprot.writeBool(struct.found);
      }
      if (struct.isSetTransaction()) {
        struct.transaction.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TransactionGetResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.status = new APIResponse();
        struct.status.read(iprot);
        struct.setStatusIsSet(true);
      }
      if (incoming.get(1)) {
        struct.found = iprot.readBool();
        struct.setFoundIsSet(true);
      }
      if (incoming.get(2)) {
        struct.transaction = new Transaction();
        struct.transaction.read(iprot);
        struct.setTransactionIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

