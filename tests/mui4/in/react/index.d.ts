export = React;
export as namespace React;

declare namespace React {
    export type ReactType<P = any> = ElementType<P>;
    export type ReactNode = string | boolean | null | undefined;
    export type PropsWithChildren<P> = P & { children?: ReactNode };
    export type Key = string | number;
    export type JSXElementConstructor<P> = ((props: P) => ReactElement | null) | (new (props: P) => Component<P, any>);

    export interface ReactElement<P = any, T extends string | JSXElementConstructor<any> = string | JSXElementConstructor<any>> {
        type: T;
        props: P;
        key: Key | null;
    }

    export interface FunctionComponent<P = {}> {
        (props: PropsWithChildren<P>, context?: any): ReactElement<any, any> | null;
    }
    export type ComponentType<P = {}> = ComponentClass<P> | FunctionComponent<P>;
    export type ComponentState = any;
    interface Component<P = {}, S = {}, SS = any> { }

    export interface ComponentClass<P = {}, S = ComponentState>  {
        new (props: P, context?: any): Component<P, S>;
    }

    export type ElementType<P = any> =
        { [K in keyof JSX.IntrinsicElements]: P extends JSX.IntrinsicElements[K] ? K : never }[keyof JSX.IntrinsicElements] | ComponentType<P>;

    interface RefObject<T> {
        readonly current: T | null;
    }
    type RefCallback<T> = { bivarianceHack(instance: T | null): void }["bivarianceHack"];
    type Ref<T> = RefCallback<T> | RefObject<T> | null;
    type LegacyRef<T> = string | Ref<T>;

    export interface CSSProperties {
        "align-content"?: "baseline" | "normal"
    }

    export type PropsWithoutRef<P> =
    // Just Pick would be sufficient for this, but I'm trying to avoid unnecessary mapping over union types
    // https://github.com/Microsoft/TypeScript/issues/28339
        'ref' extends keyof P ? Pick<P, Exclude<keyof P, 'ref'>> : P;

    /** Ensures that the props do not include string ref, which cannot be forwarded */
    export type PropsWithRef<P> =
    // Just "P extends { ref?: infer R }" looks sufficient, but R will infer as {} if P is {}.
        'ref' extends keyof P ? P extends { ref?: infer R } ? string extends R ? PropsWithoutRef<P> & { ref?: Exclude<R, string> } : P : P : P;

    export type ComponentProps<T extends keyof JSX.IntrinsicElements | JSXElementConstructor<any>> =
        T extends JSXElementConstructor<infer P> ? P : T extends keyof JSX.IntrinsicElements ? JSX.IntrinsicElements[T] : {};

    interface Attributes {
        key?: Key | null;
    }
    interface RefAttributes<T> extends Attributes {
        ref?: Ref<T>;
    }

    export type ComponentPropsWithRef<T extends ElementType> = T extends ComponentClass<infer P> ? PropsWithoutRef<P> & RefAttributes<InstanceType<T>> : PropsWithRef<ComponentProps<T>>;
    export type ComponentPropsWithoutRef<T extends ElementType> = PropsWithoutRef<ComponentProps<T>>;

    interface Attributes {
        key?: Key | null;
    }
    interface RefAttributes<T> extends Attributes {
        ref?: Ref<T>;
    }
    interface ClassAttributes<T> extends Attributes {
        ref?: LegacyRef<T>;
    }
    interface HTMLAttributes<T>{
        // React-specific Attributes
        defaultChecked?: boolean;
        defaultValue?: string | number | ReadonlyArray<string>;
    }

    interface AllHTMLAttributes<T> extends HTMLAttributes<T> {
        accept?: string;
    }

    interface ButtonHTMLAttributes<T> extends HTMLAttributes<T> {
        autoFocus?: boolean;
        type?: 'submit' | 'reset' | 'button';
    }
    interface AnchorHTMLAttributes<T> extends HTMLAttributes<T> {
        download?: any;
    }

    type DetailedHTMLProps<E extends HTMLAttributes<T>, T> = ClassAttributes<T> & E;
}

declare global {
    namespace JSX {
        export interface IntrinsicElements {
            a: React.DetailedHTMLProps<React.AnchorHTMLAttributes<HTMLAnchorElement>, HTMLAnchorElement>;
            button: React.DetailedHTMLProps<React.ButtonHTMLAttributes<HTMLButtonElement>, HTMLButtonElement>;
        }
        export interface Element extends React.ReactElement<any, any> { }
    }
}
