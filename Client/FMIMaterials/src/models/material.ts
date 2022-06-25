import { Course } from './course';
import { User } from './user';
import { MaterialType } from './material-type';

export class Material {
    constructor(private _fullname: string, private _materialType:MaterialType, private _users?:User[], private _courses?:Course[]){
    }
    
}