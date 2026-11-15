# Tenant Management System
An Android app for landlords to record tenants, see total rent, and call tenants.
## Download
Latest APK: see *Releases* on the right of this page.
## Features
- Register and log in
- Dashboard with number of tenants and total rent
- Add tenants and view all tenants (saved with Room)
- Call a tenant, options menu and navigation drawer
## Architecture
ui/ Activities, Fragments and TenantViewModel (UI layer)
data/ Tenant, TenantDao, TenantDatabase, TenantRepository (data layer)
Screens → TenantViewModel (LiveData) → TenantRepository → Room
## Team
tage | Member | Admission No. | Pull Request                                                     |
|---|---|---|------------------------------------------------------------------|
| 1 Lead | Miriam Obuba | 193336 | -                                                                |
| 2 ViewModel | Miriam Obuba | 193336 | [PR #2](https://github.com/Mi71am/TenantManagementSystem/pull/2) |
| 3 Room | Karen Muchiri | 191333 | [PR #3](https://github.com/Mi71am/TenantManagementSystem/pull/3) |
| 4 Screens | Kanyi Felista Wambui | 193480 | -                                                                |
| 5 Data Integration | Ngugi Prestone Njau | 170159 | -                                                                |
| 6 Release | Irungu Miguel | 161216| - [PR #6] () |      