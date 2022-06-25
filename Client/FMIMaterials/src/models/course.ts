import { Material } from "./material"

export class Course {
    constructor(private _fullname:string, private _courseGroup:string, private _materials?:Material[]){
    }

    get fullname(){
        return this._fullname;
    }

    set fullname(value) {
        this._fullname = value;
    }

    get courseGroup(){
        return this._courseGroup;
    }

    set courseGroup(value){
        this._courseGroup = value;
    }

    get materials(){
        return this._materials;
    }

    set materials(value) {
        this._materials = value;
    }
}