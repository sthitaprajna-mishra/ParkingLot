# Parking Lot 

Let us think about the class diagrams first.

### Class Diagrams

#### 1. ParkingLot

- Id
- Floors
- Capacity
- EntryGates
- ExitGates
- Address
- AllowedVehicleTypes
- FeeCalculationStrategy
- SlotAssignedStrategy

#### 2. ParkingFloor

- Id
- ParkingSlots
- FloorNumber
- AllowedTypeVehicles
- Status

#### 3. Gate

- Id
- GateNumber
- Status
- GateType (Entry/Exit)

#### 4. ParkingSlot

- Id
- AllowedVehicleType
- Status
- ParkingSlotNumber
- ParkingFloor

#### 5. Vehicle

- Number
- OwnerName
- Type

#### 6. Operator

- Id
- EmpId
- Name

#### 7. Token

- Id
- Number
- EntryTime
- Vehicle
- ParkingSlot
- Gate
- Operator

#### 8. Bill

- Id
- ExitTime
- Amount
- Token
- FeeCalcAlgo
- Gate
- Operator
- List < Payment >

#### 9. Payment

- Mode
- Amount
- Time
- Status
- ReferenceNumber